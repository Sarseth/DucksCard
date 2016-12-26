package pl.boardgame.duckburg.player;

import pl.boardgame.duckburg.deck.GameCardDeck;
import pl.boardgame.duckburg.deck.GraveyardStack;

public class PlayerTable {

	private GameCardDeck deck;

	private GraveyardStack graveyardStack;

	private PlayerHand playerHand;

	public PlayerTable(GameCardDeck gameCardDeck) {
		deck = gameCardDeck;
		graveyardStack = new GraveyardStack();
		playerHand = new PlayerHand();
	}

	public void initPlay(){
	}
}
