package be.kdg.geboortelijst.exception;

/**
 * Mark Goovaerts
 * Datum: 2-12-13
 */
public class GeschenkException extends Exception {
    public GeschenkException() {
    }

    public GeschenkException(String message) {
        super(message);
    }

    public GeschenkException(String message, Throwable cause) {
        super(message, cause);
    }

    public GeschenkException(Throwable cause) {
        super(cause);
    }
}
