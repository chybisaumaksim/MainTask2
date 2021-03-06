package by.epam.javatraining.chybisau.tasks.maintask02.util;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class PersistException extends Exception {

    public PersistException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersistException(Throwable cause) {
        super(cause);
    }

    public PersistException(String message) {
        super(message);
    }

    public PersistException(String cause, String message) {
        super(message);
    }
}
