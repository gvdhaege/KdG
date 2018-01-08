package be.kdg.spelling;

/**
 * @author Kristiaan Behiels
 * @version 1.0 2/12/13
 */
public class SpellingsException extends RuntimeException {
    private static int teller = 0;

    public SpellingsException(String woord, String poging) {
        super("Woord: " + woord + " -> foutieve poging nr " + ++teller + " ("+ poging + ")");
    }

}
