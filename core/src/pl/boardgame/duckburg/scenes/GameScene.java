package pl.boardgame.duckburg.scenes;

import com.badlogic.gdx.ScreenAdapter;
import pl.boardgame.duckburg.Duckburg;
import pl.boardgame.duckburg.deck.croupier.Croupier;
import pl.boardgame.duckburg.gameplay.turn.TurnManager;
import pl.boardgame.duckburg.table.TableManager;

public class GameScene extends ScreenAdapter {

	private Duckburg game;

	public GameScene(Duckburg game) {
		this.game = game;
		initGameSingletons();
	}

	private void initGameSingletons() {
		new TableManager();
		new Croupier();
		new TurnManager();
	}
}