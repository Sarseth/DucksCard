package pl.boardgame.duckburg.deck.cards;

import java.util.HashMap;
import java.util.Map;

import pl.boardgame.duckburg.deck.cards.types.CardNames;

public class CardFactory {

	public static Map<Integer, Card> createCardDeck() {
		Map<Integer, Card> cardDeckMap = new HashMap<>(150);

		cardDeckMap.putAll(createTownhallCards(cardDeckMap.size()));

		return cardDeckMap;
	}

	private static Map<Integer, Card> createTownhallCards(int idCounter) {
		Map<Integer, Card> townhallMap = new HashMap<>(10);

		townhallMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_1));
		idCounter++;
		townhallMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_2));
		idCounter++;
		townhallMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_3));
		idCounter++;
		townhallMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_4));
		idCounter++;
		townhallMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_5));
		idCounter++;
		townhallMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_6));
		idCounter++;
		townhallMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_7));
		idCounter++;
		townhallMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_8));
		idCounter++;
		townhallMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_9));
		idCounter++;
		townhallMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_10));


		return townhallMap;
	}

}
