package pl.boardgame.duckburg.deck.cards;

import java.util.HashMap;
import java.util.Map;

import pl.boardgame.duckburg.deck.cards.types.CardNames;

public class CardFactory {

	public static Map<Integer, Card> createCardDeck() {
		Map<Integer, Card> cardDeckMap = new HashMap<>(150);

		cardDeckMap.putAll(createTownhallCards(cardDeckMap.size()));
		cardDeckMap.putAll(createPoliceCards(cardDeckMap.size()));
		cardDeckMap.putAll(createFirefighterCards(cardDeckMap.size()));
		cardDeckMap.putAll(createHealthCards(cardDeckMap.size()));
		cardDeckMap.putAll(createEnterteinmentCards(cardDeckMap.size()));
		cardDeckMap.putAll(createEconomyCards(cardDeckMap.size()));
		cardDeckMap.putAll(createServicesCards(cardDeckMap.size()));
		cardDeckMap.putAll(createSportCards(cardDeckMap.size()));
		cardDeckMap.putAll(createTransportCards(cardDeckMap.size()));
		cardDeckMap.putAll(createSpecialCards(cardDeckMap.size()));
		cardDeckMap.putAll(createActionCards(cardDeckMap.size()));

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

	private static Map<Integer, Card> createSportCards(int idCounter) {
		Map<Integer, Card> cardMap = new HashMap<>(10);
		idCounter++;
		cardMap.put(idCounter, new SportCard(idCounter, CardNames.SPORT_1));
		idCounter++;
		cardMap.put(idCounter, new SportCard(idCounter, CardNames.SPORT_2));
		idCounter++;
		cardMap.put(idCounter, new SportCard(idCounter, CardNames.SPORT_3));
		idCounter++;
		cardMap.put(idCounter, new SportCard(idCounter, CardNames.SPORT_4));
		idCounter++;
		cardMap.put(idCounter, new SportCard(idCounter, CardNames.SPORT_5));
		idCounter++;
		cardMap.put(idCounter, new SportCard(idCounter, CardNames.SPORT_6));
		idCounter++;
		cardMap.put(idCounter, new SportCard(idCounter, CardNames.SPORT_7));
		idCounter++;
		cardMap.put(idCounter, new SportCard(idCounter, CardNames.SPORT_8));
		idCounter++;
		cardMap.put(idCounter, new SportCard(idCounter, CardNames.SPORT_9));
		idCounter++;
		cardMap.put(idCounter, new SportCard(idCounter, CardNames.SPORT_10));
		return cardMap;
	}

	private static Map<Integer, Card> createTransportCards(int idCounter) {
		Map<Integer, Card> cardMap = new HashMap<>(10);
		idCounter++;
		cardMap.put(idCounter, new TransportCard(idCounter, CardNames.TRANSPORT_1));
		idCounter++;
		cardMap.put(idCounter, new TransportCard(idCounter, CardNames.TRANSPORT_2));
		idCounter++;
		cardMap.put(idCounter, new TransportCard(idCounter, CardNames.TRANSPORT_3));
		idCounter++;
		cardMap.put(idCounter, new TransportCard(idCounter, CardNames.TRANSPORT_4));
		idCounter++;
		cardMap.put(idCounter, new TransportCard(idCounter, CardNames.TRANSPORT_5));
		idCounter++;
		cardMap.put(idCounter, new TransportCard(idCounter, CardNames.TRANSPORT_6));
		idCounter++;
		cardMap.put(idCounter, new TransportCard(idCounter, CardNames.TRANSPORT_7));
		idCounter++;
		cardMap.put(idCounter, new TransportCard(idCounter, CardNames.TRANSPORT_8));
		idCounter++;
		cardMap.put(idCounter, new TransportCard(idCounter, CardNames.TRANSPORT_9));
		idCounter++;
		cardMap.put(idCounter, new TransportCard(idCounter, CardNames.TRANSPORT_10));
		return cardMap;
	}

	private static Map<Integer, Card> createSpecialCards(int idCounter) {
		Map<Integer, Card> cardMap = new HashMap<>(9);
		idCounter++;
		cardMap.put(idCounter, new SpecialCard(idCounter, CardNames.SPECIAL_1));
		idCounter++;
		cardMap.put(idCounter, new SpecialCard(idCounter, CardNames.SPECIAL_2));
		idCounter++;
		cardMap.put(idCounter, new SpecialCard(idCounter, CardNames.SPECIAL_3));
		idCounter++;
		cardMap.put(idCounter, new SpecialCard(idCounter, CardNames.SPECIAL_4));
		idCounter++;
		cardMap.put(idCounter, new SpecialCard(idCounter, CardNames.SPECIAL_5));
		idCounter++;
		cardMap.put(idCounter, new SpecialCard(idCounter, CardNames.SPECIAL_6));
		idCounter++;
		cardMap.put(idCounter, new SpecialCard(idCounter, CardNames.SPECIAL_7));
		idCounter++;
		cardMap.put(idCounter, new SpecialCard(idCounter, CardNames.SPECIAL_8));
		idCounter++;
		cardMap.put(idCounter, new SpecialCard(idCounter, CardNames.SPECIAL_9));
		return cardMap;
	}

	private static Map<Integer, Card> createActionCards(int idCounter) {
		Map<Integer, Card> cardMap = new HashMap<>(50);
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_1));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_2));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_3));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_4));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_5));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_6));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_7));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_8));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_9));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_10));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_11));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_12));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_13));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_14));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_15));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_16));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_17));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_18));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_19));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_20));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_21));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_22));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_23));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_24));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_25));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_26));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_27));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_28));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_29));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_30));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_31));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_32));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_33));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_34));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_35));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_36));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_37));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_38));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_39));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_40));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_41));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_42));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_43));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_44));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_45));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_46));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_47));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_48));
		idCounter++;
		cardMap.put(idCounter, new ActionCard(idCounter, CardNames.ACTION_49));
		return cardMap;
	}
}
