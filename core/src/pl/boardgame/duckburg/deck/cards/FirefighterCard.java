package pl.boardgame.duckburg.deck.cards;

import pl.boardgame.duckburg.deck.cards.types.CardFunctionType;
import pl.boardgame.duckburg.deck.cards.types.CardType;

public class FirefighterCard extends Card{

	public FirefighterCard(int id, String name) {
		super(id, name);
	}

	@Override
	public pl.boardgame.duckburg.deck.cards.types.CardType getCardType() {
		return CardType.FIREFIGHTER;
	}

	@Override
	public CardFunctionType geCardFunctionType() {
		return CardFunctionType.CITY_SERVICES;
	}
}
