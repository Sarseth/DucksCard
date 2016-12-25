package pl.boardgame.duckburg.table;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import pl.boardgame.duckburg.deck.cards.Card;
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
		List<Point> availablePositions = new ArrayList<>();
		TableManager tableManager = TableManager.getInstance();
		//TODO: find all position on table grid which are available for arguments

		return availablePositions;
	}

	public static TableSlotVisualizer getInstance() {
		return instance;
	}
}
