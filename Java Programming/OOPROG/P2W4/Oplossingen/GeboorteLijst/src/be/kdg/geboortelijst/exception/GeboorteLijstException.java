package be.kdg.geboortelijst.exception;

/**
 * Mark Goovaerts
 * Datum: 2-12-13
 */
public class GeboorteLijstException extends Exception {
    public GeboorteLijstException() {
    }

    public GeboorteLijstException(String message) {
        super(message);
    }

    public GeboorteLijstException(String message, Throwable cause) {
        super(message, cause);
    }

    public GeboorteLijstException(Throwable cause) {
        super(cause);
    }
}
