package pl.boardgame.duckburg.deck;

import java.util.List;
import java.util.Stack;

import pl.boardgame.duckburg.deck.cards.Card;

public class GameCardDeck {

	private Stack<Card> cardStack;

	public GameCardDeck(List<Card> cardList) {
		cardStack = new Stack<>();
		for(Card card : cardList) {
			cardStack.push(card);
		}
	}

	public Card pickupCard() {
		if(cardStack.empty()) {
			return null;
		} else {
			return cardStack.pop();
		}
	}

}
