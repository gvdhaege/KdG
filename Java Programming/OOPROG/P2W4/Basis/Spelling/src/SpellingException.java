public class SpellingException extends RuntimeException {
    private static int teller = 0;

    public SpellingException(String woord, String poging) {
        super("Woord: " + woord + " -> foutieve poging nr " + ++teller + " (" + poging + ")");
    }
}
