package pl.boardgame.duckburg.deck.cards;

import pl.boardgame.duckburg.deck.cards.types.CardFunctionType;
import pl.boardgame.duckburg.deck.cards.types.CardType;

public class SportCard extends Card {

	public SportCard(int id, String name) {
		super(id, name);
	}

	@Override
	public CardType getCardType() {
		return CardType.SPORT;
	}

	@Override
	public CardFunctionType geCardFunctionType() {
		return CardFunctionType.CITY_OBJECTS;
	}
}
