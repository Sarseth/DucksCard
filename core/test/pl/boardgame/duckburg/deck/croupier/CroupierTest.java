package pl.boardgame.duckburg.deck.croupier;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;

import pl.boardgame.duckburg.GameOptions;
import pl.boardgame.duckburg.deck.GameCardDeck;
import pl.boardgame.duckburg.deck.cards.Card;
import pl.boardgame.duckburg.deck.cards.types.CardType;

public class CroupierTest {

	@BeforeClass
	public static void beforeClass() {
		new Croupier();
	}

	// bit naive, I know.
	@Test
	public void checkIfAtLeastOneTownhallCardGenerates() {
		Croupier instance = Croupier.getInstance();
		for(int i = 0; i < 10; i++) {
			GameCardDeck cardDeck = instance.createRandomDeckOfCards(GameOptions.DeckSize.SMALL);

			int townhallCardCounter = 0;
			for(int cardIterator = 0; cardIterator < GameOptions.DeckSize.SMALL.getDeckSize(); cardIterator++) {
				Card card = cardDeck.pickupCard();
				assertThat(card, notNullValue());
				if(CardType.TOWNHALL == card.getCardType()) {
					townhallCardCounter++;
				}
			}
			assertThat(townhallCardCounter >= 3, is(true)); // TODO: No internet. Find greaterThanOrEqualTo matcher and inject into project
		}
	}

}
