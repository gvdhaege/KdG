package be.kdg.mastermind.model;

import java.util.Arrays;
import java.util.Random;

/**
 * Deze klasse stelt een combinatie van kleuren voor. De grootte ligt vast op 4.
 * Via de constructor kan je een willekeurige combinatie laten genereren of een bestaande kleuren
 * array meegeven
 *
 * @author Willy Wonka
 */
public class Combination {
    public static final int COMBINATION_SIZE = 4;
    private CombinationColor[] colors = new CombinationColor[COMBINATION_SIZE];

    /**
     * De constructor genereert een nieuwe random combinatie
     *
     * @param duplicateAllowed als true kan de geheime code eenzelfde kleur meerdere keren bevatten
     **/
    public Combination(boolean duplicateAllowed) {
        Random random = new Random();
        if (duplicateAllowed) {
            for (int i = 0; i < colors.length; i++) {
                colors[i] = CombinationColor.values()[random.nextInt(CombinationColor.values().length)];
            }
        } else {
            for (int i=0;i<colors.length;i++) {
                colors[i] = CombinationColor.values()[i];
            }
            for (int i=0;i<100;i++) {
                CombinationColor tmp = colors[0];
                int randomPos = random.nextInt(CombinationColor.values().length);
                colors[0] = colors[randomPos];
                colors[randomPos] = tmp;
            }
        }
    }

    /**
     * Gebruik de meegeven kleuren in dezelfde volgorde
     * @param colors
     */
    public Combination(CombinationColor[] colors) {
        this.colors = colors;
    }

    /**
     * Geeft i-de kleur terug van de combinatie
     * @param i
     * @return
     */
    public CombinationColor getColor(int i) {
        if (i<0) throw new MastermindException("Combination can't have negative color index!");
        if (i>=COMBINATION_SIZE) throw new MastermindException("Combination contains " + COMBINATION_SIZE + " colors!");
        return colors[i];
    }

    public boolean contains(CombinationColor color){
        for (CombinationColor tmpColor: colors){
            if (tmpColor.equals(color)) return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Combination that = (Combination) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(colors, that.colors);

    }

    @Override
    public int hashCode() {
        return colors != null ? Arrays.hashCode(colors) : 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(colors);
    }
}
