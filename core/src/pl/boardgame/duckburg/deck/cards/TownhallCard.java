package pl.boardgame.duckburg.deck.cards;

import pl.boardgame.duckburg.deck.cards.types.CardFunctionType;
import pl.boardgame.duckburg.deck.cards.types.CardType;

public class TownhallCard extends Card {

	public TownhallCard(int id, String name) {
		super(id, name);
	}

	@Override
	public CardType getCardType() {
		return CardType.TOWNHALL;
	}

	@Override
	public CardFunctionType geCardFunctionType() {
		return CardFunctionType.CITY_SERVICES;
	}
}
