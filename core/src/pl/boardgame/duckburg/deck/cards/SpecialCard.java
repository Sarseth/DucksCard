package pl.boardgame.duckburg.deck.cards;

import pl.boardgame.duckburg.deck.cards.types.CardType;
import pl.boardgame.duckburg.deck.cards.types.CardFunctionType;

public class SpecialCard extends Card {

	public SpecialCard(int id, String name) {
		super(id, name);
	}

	@Override
	public CardType getCardType() {
		return CardType.SPECIAL;
	}

	@Override
	public CardFunctionType geCardFunctionType() {
		return CardFunctionType.CITY_OBJECTS;
	}
}
