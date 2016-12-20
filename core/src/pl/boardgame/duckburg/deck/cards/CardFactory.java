package pl.boardgame.duckburg.deck.cards;

import java.util.HashMap;
import java.util.Map;

import pl.boardgame.duckburg.deck.cards.types.CardNames;

public class CardFactory {

	public static Map<Integer, Card> createCardDeck() {
		Map<Integer, Card> cardDeckMap = new HashMap<>(150);

		cardDeckMap.putAll(createTownhallCards(cardDeckMap.size()));
		cardDeckMap.putAll(createPoliceCards(cardDeckMap.size()));
		cardDeckMap.putAll(createPoliceCards(cardDeckMap.size()));
		cardDeckMap.putAll(createFirefighterCards(cardDeckMap.size()));
		cardDeckMap.putAll(createHealthCards(cardDeckMap.size()));
		cardDeckMap.putAll(createEnterteinmentCards(cardDeckMap.size()));
		cardDeckMap.putAll(createEconomyCards(cardDeckMap.size()));
		cardDeckMap.putAll(createServicesCards(cardDeckMap.size()));

		return cardDeckMap;
	}

	private static Map<Integer, Card> createTownhallCards(int idCounter) {
		Map<Integer, Card> cardMap = new HashMap<>(10);
		idCounter++;
		cardMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_1));
		idCounter++;
		cardMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_2));
		idCounter++;
		cardMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_3));
		idCounter++;
		cardMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_4));
		idCounter++;
		cardMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_5));
		idCounter++;
		cardMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_6));
		idCounter++;
		cardMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_7));
		idCounter++;
		cardMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_8));
		idCounter++;
		cardMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_9));
		idCounter++;
		cardMap.put(idCounter, new TownhallCard(idCounter, CardNames.TOWNHALL_10));
		return cardMap;
	}

	private static Map<Integer, Card> createPoliceCards(int idCounter) {
		Map<Integer, Card> cardMap = new HashMap<>(7);
		idCounter++;
		cardMap.put(idCounter, new PoliceCard(idCounter, CardNames.POLICE_1));
		idCounter++;
		cardMap.put(idCounter, new PoliceCard(idCounter, CardNames.POLICE_2));
		idCounter++;
		cardMap.put(idCounter, new PoliceCard(idCounter, CardNames.POLICE_3));
		idCounter++;
		cardMap.put(idCounter, new PoliceCard(idCounter, CardNames.POLICE_4));
		idCounter++;
		cardMap.put(idCounter, new PoliceCard(idCounter, CardNames.POLICE_5));
		idCounter++;
		cardMap.put(idCounter, new PoliceCard(idCounter, CardNames.POLICE_6));
		idCounter++;
		cardMap.put(idCounter, new PoliceCard(idCounter, CardNames.POLICE_7));
		return cardMap;
	}

	private static Map<Integer, Card> createFirefighterCards(int idCounter) {
		Map<Integer, Card> cardMap = new HashMap<>(3);
		idCounter++;
		cardMap.put(idCounter, new FirefighterCard(idCounter, CardNames.FIREFIGHTER_1));
		idCounter++;
		cardMap.put(idCounter, new FirefighterCard(idCounter, CardNames.FIREFIGHTER_2));
		idCounter++;
		cardMap.put(idCounter, new FirefighterCard(idCounter, CardNames.FIREFIGHTER_3));
		return cardMap;
	}

	private static Map<Integer, Card> createHealthCards(int idCounter) {
		Map<Integer, Card> cardMap = new HashMap<>(5);
		idCounter++;
		cardMap.put(idCounter, new HealthCard(idCounter, CardNames.HEALTH_1));
		idCounter++;
		cardMap.put(idCounter, new HealthCard(idCounter, CardNames.HEALTH_2));
		idCounter++;
		cardMap.put(idCounter, new HealthCard(idCounter, CardNames.HEALTH_3));
		idCounter++;
		cardMap.put(idCounter, new HealthCard(idCounter, CardNames.HEALTH_4));
		idCounter++;
		cardMap.put(idCounter, new HealthCard(idCounter, CardNames.HEALTH_5));
		return cardMap;
	}

	private static Map<Integer, Card> createEnterteinmentCards(int idCounter) {
		Map<Integer, Card> cardMap = new HashMap<>(12);
		idCounter++;
		cardMap.put(idCounter, new EntertainmentCard(idCounter, CardNames.ENTERTAINMENT_1));
		idCounter++;
		cardMap.put(idCounter, new EntertainmentCard(idCounter, CardNames.ENTERTAINMENT_2));
		idCounter++;
		cardMap.put(idCounter, new EntertainmentCard(idCounter, CardNames.ENTERTAINMENT_3));
		idCounter++;
		cardMap.put(idCounter, new EntertainmentCard(idCounter, CardNames.ENTERTAINMENT_4));
		idCounter++;
		cardMap.put(idCounter, new EntertainmentCard(idCounter, CardNames.ENTERTAINMENT_5));
		idCounter++;
		cardMap.put(idCounter, new EntertainmentCard(idCounter, CardNames.ENTERTAINMENT_6));
		idCounter++;
		cardMap.put(idCounter, new EntertainmentCard(idCounter, CardNames.ENTERTAINMENT_7));
		idCounter++;
		cardMap.put(idCounter, new EntertainmentCard(idCounter, CardNames.ENTERTAINMENT_8));
		idCounter++;
		cardMap.put(idCounter, new EntertainmentCard(idCounter, CardNames.ENTERTAINMENT_9));
		idCounter++;
		cardMap.put(idCounter, new EntertainmentCard(idCounter, CardNames.ENTERTAINMENT_10));
		idCounter++;
		cardMap.put(idCounter, new EntertainmentCard(idCounter, CardNames.ENTERTAINMENT_11));
		idCounter++;
		cardMap.put(idCounter, new EntertainmentCard(idCounter, CardNames.ENTERTAINMENT_12));
		return cardMap;
	}

	private static Map<Integer, Card> createEconomyCards(int idCounter) {
		Map<Integer, Card> cardMap = new HashMap<>(12);
		idCounter++;
		cardMap.put(idCounter, new EconomyCard(idCounter, CardNames.ECONOMY_1));
		idCounter++;
		cardMap.put(idCounter, new EconomyCard(idCounter, CardNames.ECONOMY_2));
		idCounter++;
		cardMap.put(idCounter, new EconomyCard(idCounter, CardNames.ECONOMY_3));
		idCounter++;
		cardMap.put(idCounter, new EconomyCard(idCounter, CardNames.ECONOMY_4));
		idCounter++;
		cardMap.put(idCounter, new EconomyCard(idCounter, CardNames.ECONOMY_5));
		idCounter++;
		cardMap.put(idCounter, new EconomyCard(idCounter, CardNames.ECONOMY_6));
		idCounter++;
		cardMap.put(idCounter, new EconomyCard(idCounter, CardNames.ECONOMY_7));
		idCounter++;
		cardMap.put(idCounter, new EconomyCard(idCounter, CardNames.ECONOMY_8));
		idCounter++;
		cardMap.put(idCounter, new EconomyCard(idCounter, CardNames.ECONOMY_9));
		idCounter++;
		cardMap.put(idCounter, new EconomyCard(idCounter, CardNames.ECONOMY_10));
		idCounter++;
		cardMap.put(idCounter, new EconomyCard(idCounter, CardNames.ECONOMY_11));
		idCounter++;
		cardMap.put(idCounter, new EconomyCard(idCounter, CardNames.ECONOMY_12));
		return cardMap;
	}

	private static Map<Integer, Card> createServicesCards(int idCounter) {
		Map<Integer, Card> cardMap = new HashMap<>(23);
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_1));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_2));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_3));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_4));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_5));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_6));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_7));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_8));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_9));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_10));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_11));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_12));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_13));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_14));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_15));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_16));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_17));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_18));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_19));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_20));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_21));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_22));
		idCounter++;
		cardMap.put(idCounter, new ServicesCard(idCounter, CardNames.SERVICES_23));
		return cardMap;
	}
}
