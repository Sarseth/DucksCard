package pl.boardgame.duckburg.table;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.awt.Point;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.google.common.collect.Lists;
import pl.boardgame.duckburg.GameInitTestUtils;
import pl.boardgame.duckburg.GameOptions;
import pl.boardgame.duckburg.deck.cards.TownhallCard;
import pl.boardgame.duckburg.gameplay.turn.TurnManager;
import pl.boardgame.duckburg.player.Player;

public class TableSlotVisualizerTest {

    private static Player playerOne;

	@BeforeClass
	public static void beforeClass() {
        playerOne = GameInitTestUtils.initPlayer();
        new TableManager();
        new TurnManager();
        TableManager.getInstance().createGrid(GameOptions.TableSize.SMALL);
        new TableSlotVisualizer();
    }

    @Test
    public void checkStartingPositionsAvailable() {
        // GIVEN
        TownhallCard card = new TownhallCard(1, "townhall");
        List<Point> expectedPoints = Lists.newArrayList(
                new Point(9, 12), new Point(10, 12), new Point(8, 13), new Point(9, 13), new Point(10, 13), new Point(11, 13), new Point(7, 14),
                new Point(8, 14), new Point(9, 14), new Point(10, 14), new Point(11, 14), new Point(12, 14), new Point(6, 15), new Point(7, 15),
                new Point(8, 15), new Point(9, 15), new Point(10, 15), new Point(11, 15), new Point(12, 15), new Point(13, 15), new Point(5, 16),
                new Point(6, 16), new Point(7, 16), new Point(8, 16), new Point(9, 16), new Point(10, 16), new Point(11, 16), new Point(12, 16),
                new Point(13, 16), new Point(14, 16), new Point(4, 17), new Point(5, 17), new Point(6, 17), new Point(7, 17), new Point(8, 17),
                new Point(9, 17), new Point(10, 17), new Point(11, 17), new Point(12, 17), new Point(13, 17), new Point(14, 17), new Point(15, 17),
                new Point(3, 18), new Point(4, 18), new Point(5, 18), new Point(6, 18), new Point(7, 18), new Point(8, 18), new Point(9, 18),
                new Point(10, 18), new Point(11, 18), new Point(12, 18), new Point(13, 18), new Point(14, 18), new Point(15, 18), new Point(16, 18),
                new Point(2, 19), new Point(3, 19), new Point(4, 19), new Point(5, 19), new Point(6, 19), new Point(7, 19), new Point(8, 19), new Point(9, 19),
                new Point(10, 19), new Point(11, 19), new Point(12, 19), new Point(13, 19), new Point(14, 19), new Point(15, 19), new Point(16, 19),
                new Point(17, 19));

        // WHEN
        List<Point> availablePositions = TableSlotVisualizer.getInstance().availablePositionsForCard(playerOne, card);

        // THEN
        assertThat(availablePositions, is(expectedPoints)); //check in hamcrest docs for correct matcher
    }

    @SuppressWarnings("Duplicates")
    @Ignore
    @Test
    public void visualizeBoard() {
        int[][] intArray = new int[20][20];

        List<Point> expectedPoints = Lists.newArrayList();
        for(int x = 0; x < 20; x++) {
            for(int y = 0; y < 20; y++) {
                intArray[x][y] = 0;
                if(y > (20 / 2) && (x > 2 + (20 - y - 2) && x < 17 - (20 - y - 2))) {
                    expectedPoints.add(new Point(x, y));
                    intArray[x][y] = 1;
                }
            }
        }

        for(int x = 0; x < 20; x++) {
            for(int y = 0; y < 20; y++) {
                System.out.print(intArray[y][x]);
            }
            System.out.println("");
        }

        expectedPoints.sort((o1, o2) -> Integer.valueOf(o1.y).compareTo(o2.y));

        expectedPoints.forEach(System.out::println);
    }

}