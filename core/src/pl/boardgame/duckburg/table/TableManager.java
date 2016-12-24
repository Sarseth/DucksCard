package pl.boardgame.duckburg.table;

import java.awt.Point;

import javafx.geometry.Side;
import pl.boardgame.duckburg.deck.cards.Card;

public class TableManager {

	private TableGrid table;

	public void createGrid(int gridSize) {
		table = new TableGrid(gridSize);
	}

	public boolean checkIfPointIsFree(Point coords) {
		CardSlot[][] tableGrid = table.getTableGrid();
		return tableGrid[coords.x][coords.y].getCard() == null;
	}

	public boolean addIdAtPosition(Point coords, Card card) {
		if(checkIfPointIsFree(coords)) {
			CardSlot[][] tableGrid = table.getTableGrid();
			tableGrid[coords.x][coords.y].setCard(card);
			return true;
		} else {
			return false;
		}
	}

	public boolean removeAtPosition(Point coords) {
		if(checkIfPointIsFree(coords)) {
			return false;
		} else {
			CardSlot[][] tableGrid = table.getTableGrid();
			tableGrid[coords.x][coords.y].setCard(null);
			return true;
		}
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
}
