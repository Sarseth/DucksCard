package pl.boardgame.duckburg.player;

import java.util.List;

import pl.boardgame.duckburg.deck.GameCardDeck;
import pl.boardgame.duckburg.deck.GraveyardStack;
import pl.boardgame.duckburg.deck.cards.Card;

public class PlayerTable {

	private GameCardDeck deck;

	private GraveyardStack graveyardStack;

	private PlayerHand playerHand;

	public PlayerTable(List<Card> cardList) {
		deck = new GameCardDeck(cardList);
		graveyardStack = new GraveyardStack();
		playerHand = new PlayerHand();
	}

	public void initPlay(){
	}
}
