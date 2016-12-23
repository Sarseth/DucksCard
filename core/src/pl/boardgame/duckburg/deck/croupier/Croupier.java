package pl.boardgame.duckburg.deck.croupier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
		List<Card> randomizedCardDeck = new ArrayList<>(deckSize.getDeckSize());

		Map<Integer, Card> cardMapCopy = new HashMap<>(allCardsMap);
		randomizedCardDeck.addAll(findTownhallCards(cardMapCopy, deckSize));
		randomizedCardDeck.addAll(shuffleRestCards(cardMapCopy, deckSize, randomizedCardDeck.size()));
		Collections.shuffle(randomizedCardDeck);

		return new GameCardDeck(randomizedCardDeck);
	}

	private List<Card> shuffleRestCards(Map<Integer, Card> cardMapCopy, GameOptions.DeckSize deckSize, int size) {
		List<Card> cardList = new ArrayList<>(cardMapCopy.values());
		Collections.shuffle(cardList);
		return cardList.subList(0, deckSize.getDeckSize() - size);
	}

	private List<Card> findTownhallCards(Map<Integer, Card> cardMapCopy, GameOptions.DeckSize deckSize) {
		List<Integer> tenNumberList = new ArrayList<>();
		for(int i = 1; i < 11; i++) {
			tenNumberList.add(i);
		}
		Collections.shuffle(tenNumberList);

		List<Card> townhallCardList = new ArrayList<>();

		switch (deckSize) {
			case LARGE:
				townhallCardList.add(cardMapCopy.remove(tenNumberList.get(4)));
			case MEDIUM:
				townhallCardList.add(cardMapCopy.remove(tenNumberList.get(3)));
			case SMALL:
				townhallCardList.add(cardMapCopy.remove(tenNumberList.get(2)));
				townhallCardList.add(cardMapCopy.remove(tenNumberList.get(1)));
				townhallCardList.add(cardMapCopy.remove(tenNumberList.get(0)));
		}
		return townhallCardList;
	}

	public static Croupier getInstance() {
		return instance;
	}
}
