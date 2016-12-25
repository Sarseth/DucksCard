package pl.boardgame.duckburg.player;

import com.badlogic.gdx.graphics.Color;

public class Player {

	private final int playerId;

	private final Color playerColor;

	private final String playerName;

	private final PlayerTable playerTable;

	public Player(int playerId, Color playerColor, String playerName, PlayerTable playerTable) {
		this.playerId = playerId;
		this.playerColor = playerColor;
		this.playerName = playerName;
		this.playerTable = playerTable;
	}

	public int getPlayerId() {
		return playerId;
	}

	public Color getPlayerColor() {
		return playerColor;
	}

	public String getPlayerName() {
		return playerName;
	}

	public PlayerTable getPlayerTable() {
		return playerTable;
	}
}
