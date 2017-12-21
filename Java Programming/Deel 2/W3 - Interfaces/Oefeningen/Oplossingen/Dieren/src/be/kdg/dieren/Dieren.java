package be.kdg.dieren;

import java.util.ArrayList;
import java.util.List;

/**
 * De klasse Dieren bevat een verzameling dieren, dit zijn objecten
 * die de interface Dier implementeren. De verzameling wordt
 * gerealiseerd door een tabel (reeks). Werk de klasse verder uit.
 */
public class Dieren {
    private static final int AANTAL = 100;

    private Dier[] dieren = new Dier[AANTAL];
    private int aantal;

    /**
     * Voegt een "Dier" aan de verzameling toe
     *
     * @param dier Een Dier
     */
    public void add(Dier dier) {
        if (aantal < AANTAL) {
            dieren[aantal++] = dier;
        }
    }

    /**
     * Toont alle dieren in de verzameling door gebruik te maken
     * van hun respectievelijke toString methoden.
     */
    public void toon() {
        for (int i = 0; i < aantal; i++) {
            System.out.println(dieren[i]);
        }
    }

}
