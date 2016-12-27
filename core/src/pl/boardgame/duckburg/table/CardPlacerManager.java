package pl.boardgame.duckburg.table;

import java.awt.Point;
import java.util.Set;

import pl.boardgame.duckburg.deck.cards.Card;
import pl.boardgame.duckburg.player.Player;
import pl.boardgame.duckburg.utils.exceptions.SingletonMultipleInitializationException;

public class CardPlacerManager {

    private static CardPlacerManager instance;

    public CardPlacerManager() {
        if(instance != null) {
            throw new SingletonMultipleInitializationException(CardPlacerManager.class);
        }
        instance = this;
    }

    public boolean placeCardOnSlot(Player player, Card card, CardSlot cardSlot) {
        TableSlotVisualizer tableSlotVisualizer = TableSlotVisualizer.getInstance();
        /*
            TODO: Create simpler faster validation. Wont have to iterate over full grid. Only checking neighbors.
            But this way, we can find two working different solutions. Visualiser vs placer.
         */
        Set<Point> points = tableSlotVisualizer.availablePositionsForCard(player, card);
        return points.contains(cardSlot.getPosition());
    }

    public static CardPlacerManager getInstance() {
        return instance;
    }
}