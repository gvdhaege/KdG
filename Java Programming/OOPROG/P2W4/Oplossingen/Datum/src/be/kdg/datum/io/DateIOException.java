package be.kdg.datum.io;

/**
 * Maak een klasse DateIOException, die is afgeleid van RuntimeException
 */
public class DateIOException extends RuntimeException {
    public DateIOException() {
        super();
    }

    public DateIOException(String message) {
        super(message);
    }

    public DateIOException(String message, Throwable cause) {
        super(message, cause);
    }

    public DateIOException(Throwable cause) {
        super(cause);
    }

    protected DateIOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}