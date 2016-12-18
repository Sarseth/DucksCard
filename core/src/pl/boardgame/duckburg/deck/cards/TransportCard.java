package pl.boardgame.duckburg.deck.cards;

import pl.boardgame.duckburg.deck.cards.types.CardFunctionType;
import pl.boardgame.duckburg.deck.cards.types.CardType;

public class TransportCard extends Card {

	public TransportCard(int id, String name) {
		super(id, name);
	}

	@Override
	public pl.boardgame.duckburg.deck.cards.types.CardType getCardType() {
		return CardType.TRANSPORT;
	}

	@Override
	public CardFunctionType geCardFunctionType() {
		return CardFunctionType.CITY_OBJECTS;
	}
}
