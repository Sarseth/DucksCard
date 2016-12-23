package pl.boardgame.duckburg;

public class GameOptions {

	public enum DeckSize {
		SMALL(53),
		MEDIUM(64),
		LARGE(80);

		private int deckSize;

		DeckSize(int deckSize) {
			this.deckSize = deckSize;
		}

		public int getDeckSize() {
			return deckSize;
		}
	}

}