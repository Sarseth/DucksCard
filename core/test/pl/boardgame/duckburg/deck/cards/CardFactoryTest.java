package pl.boardgame.duckburg.deck.cards;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;

import pl.boardgame.duckburg.deck.cards.types.CardType;

@Ignore
public class CardFactoryTest {

	private static final Map<Integer, Card> CARD_DECK = CardFactory.createCardDeck();

	@Test
	public void checkDeckSize() {
		assertThat(CARD_DECK.size(), is(150));
	}

	@Test
	public void checkIfFactoryCreateInWantedOrder() {
		assertThat("TOWNHALL cards shall start at 1", CARD_DECK.get(1).getCardType(), is(CardType.TOWNHALL));
		assertThat("POLICE cards shall start at 11", CARD_DECK.get(11).getCardType(), is(CardType.POLICE));
		assertThat("FIREFIGHTER cards shall start at 18", CARD_DECK.get(18).getCardType(), is(CardType.FIREFIGHTER));
		assertThat("HEALTH cards shall start at 21", CARD_DECK.get(21).getCardType(), is(CardType.HEALTH));
		assertThat("ENTERTAINMENT cards shall start at 26", CARD_DECK.get(26).getCardType(), is(CardType.ENTERTAINMENT));
		assertThat("ECONOMY cards shall start at 38", CARD_DECK.get(38).getCardType(), is(CardType.ECONOMY));
		assertThat("SERVICES cards shall start at 50", CARD_DECK.get(50).getCardType(), is(CardType.SERVICES));
		assertThat("SPORT cards shall start at 73", CARD_DECK.get(73).getCardType(), is(CardType.SPORT));
		assertThat("TRANSPORT cards shall start at 83", CARD_DECK.get(83).getCardType(), is(CardType.TRANSPORT));
		assertThat("SPECIAL cards shall start at 93", CARD_DECK.get(93).getCardType(), is(CardType.SPECIAL));
		assertThat("ACTION cards shall start at 102", CARD_DECK.get(102).getCardType(), is(CardType.ACTION));

	}
}
