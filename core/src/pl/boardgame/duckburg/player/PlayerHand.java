package pl.boardgame.duckburg.player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import pl.boardgame.duckburg.deck.cards.Card;

public class PlayerHand {

	private Map<Integer, Card> cards;

	public PlayerHand() {
		cards = new HashMap<>();
	}

	public void addCard(Card card) {
		cards.put(card.getId(), card);
	}

	public List<Card> getAllCards() {
		return Lists.newArrayList(cards.values());
	}

	public Card getCardDate(Integer cardId) {
		return cards.get(cardId);
	}

	public Card removeAndGetCard(Integer cardId){
		return cards.get(cardId);
	}
}