package pl.boardgame.duckburg;

import com.badlogic.gdx.graphics.Color;
import pl.boardgame.duckburg.deck.GameCardDeck;
import pl.boardgame.duckburg.deck.croupier.Croupier;
import pl.boardgame.duckburg.player.Player;
import pl.boardgame.duckburg.player.PlayerTable;

public class GameInitTestUtils {

	public static Player initPlayer() {
		Croupier croupier = new Croupier();
		GameCardDeck randomDeckOfCards = croupier.createRandomDeckOfCards(GameOptions.DeckSize.MEDIUM);
		PlayerTable playerTable = new PlayerTable(randomDeckOfCards);
		return new Player(1, Color.BLUE, "Sarseth", playerTable);
	}

}
