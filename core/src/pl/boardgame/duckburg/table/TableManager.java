package pl.boardgame.duckburg.table;

import java.awt.Point;
import java.util.List;

import com.google.common.collect.Lists;
import pl.boardgame.duckburg.GameOptions;
import pl.boardgame.duckburg.deck.cards.Card;
import pl.boardgame.duckburg.player.Player;
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

	public void createGrid(GameOptions.TableSize tableSize) {
		table = new TableGrid(tableSize.getTableSize());
	}

	public boolean checkIfPointIsFree(Point position) {
		CardSlot[][] tableGrid = table.getTableGrid();
		return tableGrid[position.x][position.y].getCard() == null;
	}

	public boolean addCardAtPosition(Point position, Card card, Player player) {
		if(checkIfPointIsFree(position)) {
			CardSlot[][] tableGrid = table.getTableGrid();
			CardSlot cardSlot = tableGrid[position.x][position.y];
			cardSlot.setCard(card);
			cardSlot.setOwner(player);
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

	public GridNeighbors getNeighbors(Point point) {
		int x = point.x;
		int y = point.y;
		CardSlot topNeighbor = (point.y > 0) ? table.getTableGrid()[x][y - 1] : null;
		CardSlot rightNeighbor = (point.x < table.getGridSize() - 1) ? table.getTableGrid()[x + 1][y] : null;
		CardSlot bottomNeighbor = (point.y < table.getGridSize() - 1) ? table.getTableGrid()[x][y + 1] : null;
		CardSlot leftNeighbor = (point.x > 0) ? table.getTableGrid()[x - 1][y] : null;

		return new GridNeighbors(topNeighbor, rightNeighbor, bottomNeighbor, leftNeighbor);
	}

	public static class GridNeighbors {

		private final CardSlot topNeighbor;
		private final CardSlot rightNeighbor;
		private final CardSlot bottomNeighbor;
		private final CardSlot leftNeighbor;

		public GridNeighbors(CardSlot topNeighbor, CardSlot rightNeighbor, CardSlot bottomNeighbor, CardSlot leftNeighbor) {
			this.topNeighbor = topNeighbor;
			this.rightNeighbor = rightNeighbor;
			this.bottomNeighbor = bottomNeighbor;
			this.leftNeighbor = leftNeighbor;
		}

		public CardSlot getTopNeighbor() {
			return topNeighbor;
		}

		public CardSlot getRightNeighbor() {
			return rightNeighbor;
		}

		public CardSlot getBottomNeighbor() {
			return bottomNeighbor;
		}

		public CardSlot getLeftNeighbor() {
			return leftNeighbor;
		}

		public List<CardSlot> getAsList() {
			return Lists.newArrayList(topNeighbor, rightNeighbor, bottomNeighbor, leftNeighbor);
		}
	}

	public static TableManager getInstance() {
		return instance;
	}
}
