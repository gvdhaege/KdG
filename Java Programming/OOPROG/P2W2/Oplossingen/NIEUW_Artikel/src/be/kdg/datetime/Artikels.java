package be.kdg.datetime;

import java.time.LocalDate;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25/10/2014
 */
public class Artikels {
    private static final int AANTAL_ARTIKELS = 6;

    private Artikel[] artikels = new Artikel[AANTAL_ARTIKELS];

    // Kopie maken van de artikels
    public Artikels(Artikel[] artikels) {
        for (int i = 0; i < artikels.length; i++) {
            this.artikels[i] = artikels[i];
        }
    }

    public Artikel[] getArtikels() {
        return artikels;
    }
}
