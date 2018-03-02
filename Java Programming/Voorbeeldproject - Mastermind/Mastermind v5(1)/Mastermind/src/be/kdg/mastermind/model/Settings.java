package be.kdg.mastermind.model;

/**
 * Deze klasse verzamelt de verschillende settings voor het spel. Voor elke setting is een getter en een setter.
 * De constructor van deze klasse is bewust package private gehouden, zodat views of presenters geen extra settings objecten
 * kunnen aanmaken. De Mastermind klasse beheert de settings.
 *
 * @author Willy Wonka
 */
public class Settings {
    private boolean duplicateColorsAllowed = false;
    private int numberOfGuesses = 9;

    //making constructor package private, so presenters cant access it
    Settings() {
    }

    public void setDuplicateColorsAllowed(boolean duplicateColorsAllowed) {
        this.duplicateColorsAllowed = duplicateColorsAllowed;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }

    public boolean isDuplicateColorsAllowed() {
        return duplicateColorsAllowed;
    }

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }
}
