package pl.boardgame.duckburg;

public class GameOptions {

	public enum DeckSize {
		SMALL(53),
		MEDIUM(64),
		LARGE(80);

		private final int deckSize;

		DeckSize(int deckSize) {
			this.deckSize = deckSize;
		}

		public int getDeckSize() {
			return deckSize;
		}
	}

	public enum TableSize {
		SMALL(20),
		MEDIUM(30),
		LARGE(40);

		private final int tableSize;

		TableSize(int tableSize) {
			this.tableSize = tableSize;
		}

		public int getTableSize() {
			return tableSize;
		}
	}

}