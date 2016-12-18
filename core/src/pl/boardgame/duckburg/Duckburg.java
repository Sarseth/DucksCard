package pl.boardgame.duckburg;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pl.boardgame.duckburg.scenes.GameScene;

public class Duckburg extends Game {

	private SpriteBatch batch;

	@Override
	public void create() {
		batch = new SpriteBatch();
		setScreen(new GameScene(this));
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1f, 1f, 1f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		super.render();
	}

	@Override
	public void dispose() {
		batch.dispose();
	}

	public SpriteBatch getBatch() {
		return batch;
	}
}
