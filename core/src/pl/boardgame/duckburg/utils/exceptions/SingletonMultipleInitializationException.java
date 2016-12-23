package pl.boardgame.duckburg.utils.exceptions;

public class SingletonMultipleInitializationException extends RuntimeException {

	public SingletonMultipleInitializationException(Class clazz) {
		super("Multiple initialization on " + clazz.getName());
	}

}
