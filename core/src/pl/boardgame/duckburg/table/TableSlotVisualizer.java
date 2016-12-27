package pl.boardgame.duckburg.table;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

import pl.boardgame.duckburg.deck.cards.Card;
import pl.boardgame.duckburg.deck.cards.types.CardType;
import pl.boardgame.duckburg.gameplay.turn.TurnManager;
import pl.boardgame.duckburg.player.Player;
import pl.boardgame.duckburg.utils.exceptions.SingletonMultipleInitializationException;

public class TableSlotVisualizer {

    private static TableSlotVisualizer instance;

    public TableSlotVisualizer() {
        if(instance != null) {
            throw new SingletonMultipleInitializationException(TableSlotVisualizer.class);
        }
        instance = this;
    }

    public Set<Point> availablePositionsForCard(Player player, Card card) {
        Set<Point> availablePositions;
        if(CardType.TOWNHALL == card.getCardType()) {
            availablePositions = findAvailableSlotsForTownhall(player);
        } else if(CardType.ACTION == card.getCardType()) {
            availablePositions = findAvailableSlotsForAction(player, card);
        } else {
            availablePositions = findAvailableSlotsForBuilding(player, false);
        }
        return availablePositions;
    }

    private Set<Point> findAvailableSlotsForBuilding(Player player, boolean forTownhall) {
        Set<Point> availablePositions = new HashSet<>();
        TableManager tableManager = TableManager.getInstance();
        CardSlot[][] cardSlots = tableManager.provideFullGrid();
        int tableSize = cardSlots.length;
        for(int x = 0; x < tableSize; x++) {
            for(int y = 0; y < tableSize; y++) {
                Point point = new Point(x, y);
                CardSlot cardSlot = cardSlots[x][y];
                if((forTownhall && isPlayersOwnBuilding(player, cardSlot)) || (!forTownhall && isPlayersOwnTownhall(player, cardSlot))) {
                    addEmptyNeighbors(availablePositions, tableManager, point);
                }
            }
        }
        return availablePositions;
    }

    private void addEmptyNeighbors(Set<Point> availablePositions, TableManager tableManager, Point point) {
        TableManager.GridNeighbors neighbors = tableManager.getNeighbors(point);
        for(CardSlot neighborSlot : neighbors.getAsList()) {
            if(tableManager.checkIfPointIsFree(neighborSlot.getPosition())) {
                availablePositions.add(neighborSlot.getPosition());
            }
        }
    }

    private boolean isPlayersOwnBuilding(Player player, CardSlot cardSlot) {
        Card card = cardSlot.getCard();
        return card != null && cardSlot.getOwner().getPlayerId() == player.getPlayerId();
    }

    private boolean isPlayersOwnTownhall(Player player, CardSlot cardSlot) {
        Card card = cardSlot.getCard();
        return card != null && CardType.TOWNHALL == card.getCardType() && cardSlot.getOwner().getPlayerId() == player.getPlayerId();
    }

    private Set<Point> findAvailableSlotsForTownhall(Player player) {
        Set<Point> availablePoints;
        if(TurnManager.getInstance().isInitTurn()) {
            availablePoints = findPlayerStartingTriangle();
        } else {
            availablePoints = findAvailableSlotsForBuilding(player, true);
        }
        return availablePoints;
    }


    private Set<Point> findPlayerStartingTriangle() {
        Set<Point> availablePoints = new HashSet<>();
        CardSlot[][] cardSlots = TableManager.getInstance().provideFullGrid();
        for(int y = 0; y < cardSlots.length; y++) {
            for(int x = 0; x < cardSlots.length; x++) {
                if(y > (20 / 2) && (x > 2 + (20 - y - 2) && x < 17 - (20 - y - 2))) {
                    availablePoints.add(new Point(x, y));
                }
            }
        }
        return availablePoints;
    }

    private Set<Point> findAvailableSlotsForAction(Player player, Card card) {
        return null;
    }

    public static TableSlotVisualizer getInstance() {
        return instance;
    }
}
