package be.kdg.toetsen;

/**
 * @author Kristiaan Behiels
 * @version 1.0 29/10/13
 */
public enum Kleur {
    HARTEN("Harten"), SCHOPPEN("Schoppen"), RUITEN("Ruiten"), KLAVEREN("Klaveren");

    private String naam;

    private Kleur(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return naam;
    }
}

