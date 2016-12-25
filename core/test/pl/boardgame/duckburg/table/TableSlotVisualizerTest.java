package pl.boardgame.duckburg.table;

import org.junit.BeforeClass;
import org.junit.Test;

public class TableSlotVisualizerTest {

	@BeforeClass
	public static void beforeClass() {
		new TableManager();
		TableManager.getInstance().createGrid(20);
	}

	//@Test
	//public void check

}