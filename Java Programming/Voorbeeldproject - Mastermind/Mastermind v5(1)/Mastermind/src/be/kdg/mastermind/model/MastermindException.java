package be.kdg.mastermind.model;

/**
 * Standaard exception voor het spel.
 *
 * @author Willy Wonka
 */
public class MastermindException extends RuntimeException {
    public MastermindException(String s) {
        super(s);
    }

    public MastermindException(Throwable cause) {
        super(cause);
    }
}
