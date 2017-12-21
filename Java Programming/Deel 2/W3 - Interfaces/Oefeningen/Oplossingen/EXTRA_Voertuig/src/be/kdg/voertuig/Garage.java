package be.kdg.voertuig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * De klasse Garage bevat een verzameling van objecten van het type Auto.
 */
public class Garage {
    private AutoImpl[] wagens = new AutoImpl[4];  // Mag geen null-waarden bevatten, anders werkt Arrays.sort niet!
    private int aantal;

    /**
     * De methode voegToe voegt een Auto-object aan de verzameling toe.
     *
     * @param auto Een Auto object
     */
    public void voegToe(AutoImpl auto) {
        wagens[aantal++] = auto;
    }

    /**
     * De methode sorteer rangschikt de wagens volgens het oplopend vermogen per liter.
     */
    public void sorteer() {
        Arrays.sort(wagens);
    }

    /**
     * De methode toon drukt voor alle wagens de volledige informatie af
     * gebruik makende van de toString-methode van de klasse AutoImpl waarin intern
     * gebruik gemaakt wordt van de toString-methode van de klasse Motor..
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < aantal; i++) {
            builder.append(wagens[i]).append('\n');
        }
        return builder.toString();
    }
}
