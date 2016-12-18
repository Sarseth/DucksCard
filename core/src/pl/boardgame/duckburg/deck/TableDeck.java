package pl.boardgame.duckburg.deck;

import java.util.Stack;

import pl.boardgame.duckburg.deck.cards.Card;

public class TableDeck {

	private Stack<Card> cardStack;

	public TableDeck(Stack<Card> cardStack) {
		this.cardStack = cardStack;
	}

	public Card takeCard() {
		if(cardStack.empty()) {
			return null;
		}
		return cardStack.pop();
	}
}
