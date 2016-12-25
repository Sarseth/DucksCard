package pl.boardgame.duckburg.table;

import java.awt.Point;

import pl.boardgame.duckburg.deck.cards.Card;
import pl.boardgame.duckburg.player.Player;

public class CardSlot {

	private Player owner;

	private Card card;

	private final Point position;

	public CardSlot(int x, int y) {
		position = new Point(x, y);
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Point getPosition() {
		return position;
	}
}
