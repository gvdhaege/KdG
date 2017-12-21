package be.kdg.rechthoek;

import java.io.IOException;

public class NegativeSizeException extends RuntimeException {
   /* public NegativeSizeException() {
        super();
    } */

    // Enige gebruikte constructor
    public NegativeSizeException(String message) {
        super(message);
    }

    public NegativeSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    /*
    public NegativeSizeException(Throwable cause) {
        super(cause);
    }
    */
}
