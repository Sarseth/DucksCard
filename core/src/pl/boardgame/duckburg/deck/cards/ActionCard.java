package pl.boardgame.duckburg.deck.cards;

import pl.boardgame.duckburg.deck.cards.types.CardFunctionType;
import pl.boardgame.duckburg.deck.cards.types.CardType;

public class ActionCard extends Card {

	public ActionCard(int id, String name) {
		super(id, name);
	}

	@Override
	public CardType getCardType() {
		return CardType.ACTION;
	}

	@Override
	public CardFunctionType geCardFunctionType() {
		return CardFunctionType.ACTION;
	}
}
