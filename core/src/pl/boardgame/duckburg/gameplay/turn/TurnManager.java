package pl.boardgame.duckburg.gameplay.turn;

import java.util.Random;

import pl.boardgame.duckburg.utils.exceptions.SingletonMultipleInitializationException;

public class TurnManager {

	private static TurnManager instance;

	enum TurnPhase {
		INIT_TURN,
		PLAYER_1,
		PLAYER_2,
		PLAYER_3,
		PLAYER_4;
	}

	private TurnPhase currentPhase;

	public TurnManager() {
		if(getInstance() != null) {
			throw new SingletonMultipleInitializationException(TurnManager.class);
		}
		instance = this;
		currentPhase = TurnPhase.INIT_TURN;
	}

	public TurnPhase nextTurn(){
		switch (currentPhase) {
			case INIT_TURN:
				int playerIdx = new Random().nextInt(4);
				if(playerIdx == 0) {
					currentPhase = TurnPhase.PLAYER_1;
				} else if(playerIdx == 1) {
					currentPhase = TurnPhase.PLAYER_2;
				} else if(playerIdx == 2) {
					currentPhase = TurnPhase.PLAYER_3;
				} else if(playerIdx == 3) {
					currentPhase = TurnPhase.PLAYER_4;
				}
				break;
			case PLAYER_1:
				currentPhase = TurnPhase.PLAYER_2;
				break;
			case PLAYER_2:
				currentPhase = TurnPhase.PLAYER_3;
				break;
			case PLAYER_3:
				currentPhase = TurnPhase.PLAYER_4;
				break;
			case PLAYER_4:
				currentPhase = TurnPhase.PLAYER_1;
				break;
		}
		return currentPhase;
	}

	public static TurnManager getInstance() {
		return instance;
	}
}