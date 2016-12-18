package pl.boardgame.duckburg.deck.cards.types;

import com.badlogic.gdx.graphics.Color;

public enum CardType {

	SPORT(Color.BLUE),
	TRANSPORT(Color.ORANGE),
	ENTERTAINMENT(Color.PINK),
	ECONOMY(Color.GREEN),
	SPECIAL(Color.RED),
	SERVICES(Color.YELLOW),
	TOWNHALL(Color.PURPLE),
	FIREFIGHTER(Color.BROWN),
	HEALTH(Color.GREEN),
	POLICE(Color.BLUE),
	ACTION(Color.WHITE);

	private Color color;

	CardType(Color color) {
		this.color = color;
	}
}
