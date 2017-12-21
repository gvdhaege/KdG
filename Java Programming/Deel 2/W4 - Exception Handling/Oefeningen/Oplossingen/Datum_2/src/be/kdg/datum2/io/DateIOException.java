package be.kdg.datum2.io;

import java.io.IOException;

/**
 * Exception klasse voor fouten bij de invoer van een datum.
 */
public class DateIOException extends IOException {
    /**
     * Constructor voor een default exception object
     *
     * @param datum De foute datum
     */
    public DateIOException(String datum) {
        super(datum);
    }

    /**
     * Constructor voor een exception object met extra uitleg in de vorm van een message.
     *
     * @param message De extra uitleg
     * @param datum   De foute datum
     */
    public DateIOException(String message, String datum) {
        super(message + " - " + datum);
    }
}
