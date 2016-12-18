package pl.boardgame.duckburg.deck.cards;

import pl.boardgame.duckburg.deck.cards.types.CardFunctionType;
import pl.boardgame.duckburg.deck.cards.types.CardType;

public class EconomyCard extends Card {

	public EconomyCard(int id, String name) {
		super(id, name);
	}

	@Override
	public CardType getCardType() {
		return CardType.ECONOMY;
	}

	@Override
	public CardFunctionType geCardFunctionType() {
		return CardFunctionType.CITY_OBJECTS;
	}
}
