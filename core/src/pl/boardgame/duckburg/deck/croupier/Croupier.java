package pl.boardgame.duckburg.deck.croupier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import pl.boardgame.duckburg.GameOptions;
import pl.boardgame.duckburg.deck.GameCardDeck;
import pl.boardgame.duckburg.deck.cards.Card;
import pl.boardgame.duckburg.deck.cards.CardFactory;
import pl.boardgame.duckburg.utils.exceptions.SingletonMultipleInitializationException;

public class Croupier {

	private static Croupier instance;

	private final Map<Integer, Card> allCardsMap;

	private Random random = new Random();

	public Croupier() {
		if(getInstance() != null) {
			throw new SingletonMultipleInitializationException(Croupier.class);
		}
		instance = this;
		allCardsMap = CardFactory.createCardDeck(); // TODO: make it unmodifiable map (get guava or something)
	}

	public GameCardDeck createRandomDeckOfCards(GameOptions.DeckSize deckSize) {
		List<Card> randomizedCardDeck = new ArrayList<>();

		Map<Integer, Card> cardMapCopy = new HashMap<>(allCardsMap);
		randomizedCardDeck.addAll(findTownhallCards(cardMapCopy, deckSize));

		return new GameCardDeck(randomizedCardDeck);
	}

	private List<Card> findTownhallCards(Map<Integer, Card> cardMapCopy, GameOptions.DeckSize deckSize) {
		int idxFirstTownhallCard = random.nextInt(10);
		Card townhallCard = cardMapCopy.get(idxFirstTownhallCard + 1);
		List<Card> townhallCardList = new ArrayList<>();
		townhallCardList.add(townhallCard);
		//random.ints(4, 1,10);
		switch (deckSize) {
			case LARGE:
		//		townhallCardList.add(findNextTownhallCard());
			case MEDIUM:

			case SMALL:
		}

		return townhallCardList;
	}

	public static Croupier getInstance() {
		return instance;
	}
}
