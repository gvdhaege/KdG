package be.kdg.mastermind.model;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by vochtenh on 17/02/2016.
 */
public class Combination {
    public static final int COMBINATION_SIZE = 4;
    private CombinationColor[] colors = new CombinationColor[COMBINATION_SIZE];

    //default constructor: create random combination
    public Combination() {
        Random random = new Random();
        for (int i=0;i<colors.length;i++){
            colors[i] = CombinationColor.values()[random.nextInt(CombinationColor.values().length)];
        }
    }

    public Combination(CombinationColor[] colors) {
        this.colors = colors;
    }

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
        return "Combination{" +
                "colors=" + Arrays.toString(colors) +
                '}';
    }
}
