package pl.boardgame.duckburg.deck.cards;

import pl.boardgame.duckburg.deck.cards.types.CardFunctionType;
import pl.boardgame.duckburg.deck.cards.types.CardType;

public class EntertainmentCard extends Card {

	public EntertainmentCard(int id, String name) {
		super(id, name);
	}

	@Override
	public CardType getCardType() {
		return CardType.ENTERTAINMENT;
	}

	@Override
	public CardFunctionType geCardFunctionType() {
		return CardFunctionType.CITY_OBJECTS;
	}
}
