package pl.boardgame.duckburg.deck;

import java.util.Stack;

import pl.boardgame.duckburg.deck.cards.Card;

public class GraveyardStack {

	private Stack<Card> cardStack;

	public GraveyardStack() {
		cardStack = new Stack<Card>();
	}

	public void putCardOnGraveyard(Card card) {
		cardStack.push(card);
	}

}
