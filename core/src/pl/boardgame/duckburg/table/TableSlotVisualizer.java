package pl.boardgame.duckburg.table;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

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

	public List<Point> availablePositionsForCard(Player player, Card card) {
		List<Point> availablePositions;
		if(CardType.TOWNHALL == card.getCardType()) {
			availablePositions = findAvailableSlotsForTownhall(player, card);
        } else if(CardType.ACTION == card.getCardType()) {
            availablePositions = findAvailableSlotsForAction(player, card);
        } else {
            availablePositions = findAvailableSlotsForBuilding(player);
        }
        return availablePositions;
    }

    private List<Point> findAvailableSlotsForBuilding(Player player) {
        List<Point> availablePositions = new ArrayList<>();
        TableManager tableManager = TableManager.getInstance();
        CardSlot[][] cardSlots = tableManager.provideFullGrid();
        int tableSize = cardSlots.length;
        for(int x = 0; x < tableSize; x++) {
            for(int y = 0; y < tableSize; y++) {
                Point point = new Point(x, y);
                CardSlot cardSlot = cardSlots[x][y];
                if(isPlayersOwnTownhall(player, cardSlot)) {
                    addEmptyNeighbors(availablePositions, tableManager, point);
                }
            }
        }
        return availablePositions;
    }

    private void addEmptyNeighbors(List<Point> availablePositions, TableManager tableManager, Point point) {
        TableManager.GridNeighbors neighbors = tableManager.getNeighbors(point);
        for(CardSlot neighborSlot : neighbors.getAsList()) {
            if(tableManager.checkIfPointIsFree(neighborSlot.getPosition())) {
                availablePositions.add(neighborSlot.getPosition());
            }
        }
    }

    private boolean isPlayersOwnTownhall(Player player, CardSlot cardSlot) {
        Card card = cardSlot.getCard();
        return card != null && CardType.TOWNHALL == card.getCardType() && cardSlot.getOwner().getPlayerId() == player.getPlayerId();
    }

    private List<Point> findAvailableSlotsForTownhall(Player player, Card card) {
        List<Point> availablePoints;
        if(TurnManager.getInstance().isInitTurn()) {
            availablePoints = findPlayerStartingTriangle();
        } else {
            availablePoints = null;
        }
        return availablePoints;
    }

    private List<Point> findPlayerStartingTriangle() {
        List<Point> availablePoints;
        CardSlot[][] cardSlots = TableManager.getInstance().provideFullGrid();
        availablePoints = new ArrayList<>();
        for(int y = 0; y < cardSlots.length; y++) {
            for(int x = 0; x < cardSlots.length; x++) {
                if(y > (20 / 2) && (x > 2 + (20 - y - 2) && x < 17 - (20 - y - 2))) {
                    availablePoints.add(new Point(x, y));
                }
            }
        }
        return availablePoints;
    }

    private List<Point> findAvailableSlotsForAction(Player player, Card card) {
        return null;
    }

	public static TableSlotVisualizer getInstance() {
		return instance;
	}
}
