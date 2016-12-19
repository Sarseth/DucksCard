package pl.boardgame.duckburg.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import pl.boardgame.duckburg.Duckburg;

public class DesktopLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Duckburg";
		config.height = 960;
		config.width = 1600;
		config.fullscreen = false;
		new LwjglApplication(new Duckburg(), config);
	}
}
