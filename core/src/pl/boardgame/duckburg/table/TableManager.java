package pl.boardgame.duckburg.table;

import java.awt.Point;

import javafx.geometry.Side;
import pl.boardgame.duckburg.deck.cards.Card;
import pl.boardgame.duckburg.utils.exceptions.SingletonMultipleInitializationException;

public class TableManager {

	private TableGrid table;

	private static TableManager instance;

	public TableManager() {
		if(getInstance() != null) {
			throw new SingletonMultipleInitializationException(TableManager.class);
		}
		instance = this;
	}

	public void createGrid(int gridSize) {
		table = new TableGrid(gridSize);
	}

	public boolean checkIfPointIsFree(Point position) {
		CardSlot[][] tableGrid = table.getTableGrid();
		return tableGrid[position.x][position.y].getCard() == null;
	}

	public boolean addIdAtPosition(Point position, Card card) {
		if(checkIfPointIsFree(position)) {
			CardSlot[][] tableGrid = table.getTableGrid();
			tableGrid[position.x][position.y].setCard(card);
			return true;
		} else {
			return false;
		}
	}

	public boolean removeAtPosition(Point position) {
		if(checkIfPointIsFree(position)) {
			return false;
		} else {
			CardSlot[][] tableGrid = table.getTableGrid();
			tableGrid[position.x][position.y].setCard(null);
			return true;
		}
	}

	public CardSlot[][] provideFullGrid() {
		return table.getTableGrid();
	}

	private static class GridNeighbors {

		private final int[] neighbors;

		public GridNeighbors(int[] neighbors) {
			this.neighbors = neighbors;
		}

		public int[] getNeighbors() {
			return neighbors;
		}

		public int getNeighbor(Side side) {
			switch (side) {
				case TOP:

					break;
				case BOTTOM:
					break;
				case LEFT:
					break;
				case RIGHT:
					break;
			}
			return 0;
		}

	}

	public static TableManager getInstance() {
		return instance;
	}
}
