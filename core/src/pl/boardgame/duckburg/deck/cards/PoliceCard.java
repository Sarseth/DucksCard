package pl.boardgame.duckburg.deck.cards;

import pl.boardgame.duckburg.deck.cards.types.CardFunctionType;
import pl.boardgame.duckburg.deck.cards.types.CardType;

public class PoliceCard extends Card {

	public PoliceCard(int id, String name) {
		super(id, name);
	}

	@Override
	public CardType getCardType() {
		return CardType.POLICE;
	}

	@Override
	public CardFunctionType geCardFunctionType() {
		return CardFunctionType.CITY_SERVICES;
	}
}
