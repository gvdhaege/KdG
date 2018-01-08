package be.kdg.customexception;

/**
 * @author Kristiaan Behiels
 * @version 1.0 17/11/13
 */
public class NegativeSizeException extends RuntimeException {
    public NegativeSizeException() {
    }

    public NegativeSizeException(String message) {
        super(message);
    }

    public NegativeSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeSizeException(Throwable cause) {
        super(cause);
    }

    public NegativeSizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
