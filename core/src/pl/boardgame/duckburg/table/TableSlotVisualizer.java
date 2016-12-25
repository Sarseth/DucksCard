package pl.boardgame.duckburg.table;

import java.awt.Point;
import java.util.List;

import pl.boardgame.duckburg.deck.cards.Card;
import pl.boardgame.duckburg.deck.cards.types.CardType;
import pl.boardgame.duckburg.player.Player;
import pl.boardgame.duckburg.utils.exceptions.SingletonMultipleInitializationException;

public class TableSlotVisualizer {

	private static TableSlotVisualizer instance;

	public TableSlotVisualizer() {
		if(instance != null) {
			throw new SingletonMultipleInitializationException(TableSlotVisualizer.class);
		}
		instance = this;
	}

	public List<Point> availablePositionsForCard(Player player, Card card) {
		List<Point> availablePositions;
		if(CardType.TOWNHALL == card.getCardType()) {
			availablePositions = findAvailableSlotsForTownhall(player, card);
		} else if(CardType.ACTION != card.getCardType()) {
			availablePositions = findAvailableSlotsForBuilding(player, card);
		} else {
			availablePositions = findAvailableSlotsForAction(player, card);
		}
		return availablePositions;
	}

	private List<Point> findAvailableSlotsForBuilding(Player player, Card card) {
		return null;
	}

	private List<Point> findAvailableSlotsForTownhall(Player player, Card card) {
		return null;
	}

	private List<Point> findAvailableSlotsForAction(Player player, Card card) {
		return null;
	}

	public static TableSlotVisualizer getInstance() {
		return instance;
	}
}
