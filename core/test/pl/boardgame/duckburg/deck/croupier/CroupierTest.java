package pl.boardgame.duckburg.deck.croupier;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;

import pl.boardgame.duckburg.GameOptions;
import pl.boardgame.duckburg.deck.GameCardDeck;
import pl.boardgame.duckburg.deck.cards.Card;
import pl.boardgame.duckburg.deck.cards.types.CardType;

//TODO: make it parametrized
public class CroupierTest {

	@BeforeClass
	public static void beforeClass() {
		new Croupier();
	}

	// bit naive, I know.
	@Test
	public void checkIfAtLeastThreeTownhallCardGeneratesForDeck() {
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

	@Test
	public void checkIfAtLeastFourTownhallCardGeneratesForDeck() {
		Croupier instance = Croupier.getInstance();
		for(int i = 0; i < 10; i++) {
			GameCardDeck cardDeck = instance.createRandomDeckOfCards(GameOptions.DeckSize.MEDIUM);

			int townhallCardCounter = 0;
			for(int cardIterator = 0; cardIterator < GameOptions.DeckSize.MEDIUM.getDeckSize(); cardIterator++) {
				Card card = cardDeck.pickupCard();
				assertThat(card, notNullValue());
				if(CardType.TOWNHALL == card.getCardType()) {
					townhallCardCounter++;
				}
			}
			assertThat(townhallCardCounter >= 4, is(true)); // TODO: No internet. Find greaterThanOrEqualTo matcher and inject into project
		}
	}

	@Test
	public void checkIfAtLeastFiveTownhallCardGeneratesForDeck() {
		Croupier instance = Croupier.getInstance();
		for(int i = 0; i < 10; i++) {
			GameCardDeck cardDeck = instance.createRandomDeckOfCards(GameOptions.DeckSize.LARGE);

			int townhallCardCounter = 0;
			for(int cardIterator = 0; cardIterator < GameOptions.DeckSize.LARGE.getDeckSize(); cardIterator++) {
				Card card = cardDeck.pickupCard();
				assertThat(card, notNullValue());
				if(CardType.TOWNHALL == card.getCardType()) {
					townhallCardCounter++;
				}
			}
			assertThat(townhallCardCounter >= 5, is(true)); // TODO: No internet. Find greaterThanOrEqualTo matcher and inject into project
		}
	}


	@Test
	public void noDuplicatesShouldBeGenerated() {
		Croupier instance = Croupier.getInstance();
		for(int i = 0; i < 20; i++) {
			Set<Integer> pickedUpCardsIdSet = new HashSet<>();
			GameCardDeck cardDeck = instance.createRandomDeckOfCards(GameOptions.DeckSize.LARGE);

			for(int cardIterator = 0; cardIterator < GameOptions.DeckSize.LARGE.getDeckSize(); cardIterator++) {
				Card card = cardDeck.pickupCard();
				assertThat(pickedUpCardsIdSet.add(card.getId()), is(true));
			}
		}
	}

}
