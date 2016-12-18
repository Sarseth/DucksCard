package pl.boardgame.duckburg.table;

class TableGrid {

	private final int gridSize;

	private CardSlot[][] tableGrid;

	TableGrid(int gridSize) {
		this.gridSize = gridSize;
		tableGrid = new CardSlot[gridSize][gridSize];
		prepareEmptyTable();
	}

	int getGridSize() {
		return gridSize;
	}

	CardSlot[][] getTableGrid() {
		return tableGrid;
	}

	private void prepareEmptyTable() {
		for(int i = 0; i < gridSize; i++) {
			for(int j = 0; j < gridSize; j++) {
				tableGrid[i][j] = new CardSlot();
			}
		}
	}
}
