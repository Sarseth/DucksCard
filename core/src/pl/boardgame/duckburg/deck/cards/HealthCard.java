package pl.boardgame.duckburg.deck.cards;

import pl.boardgame.duckburg.deck.cards.types.CardFunctionType;
import pl.boardgame.duckburg.deck.cards.types.CardType;

public class HealthCard extends Card {

	public HealthCard(int id, String name) {
		super(id, name);
	}

	@Override
	public CardType getCardType() {
		return CardType.HEALTH;
	}

	@Override
	public CardFunctionType geCardFunctionType() {
		return CardFunctionType.CITY_SERVICES;
	}
}
