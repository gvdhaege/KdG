package be.steven.mastermind.model;

import java.util.Arrays;
import java.util.Random;

public class Combination {
    public static final int COMBINATION_SIZE = 4;
    private CombinationColor[] colors = new CombinationColor[COMBINATION_SIZE];

    public Combination() {
        Random random = new Random();
        for (int i = 0; i < colors.length; i++) {
            colors[i] = CombinationColor.values()[random.nextInt(CombinationColor.values().length)];
        }
    }

    public Combination(CombinationColor[] colors) {
        this.colors = colors;
    }

    public CombinationColor getColor(int index) {
        if (index < 0) {
            throw new MastermindException("Combation can't have a negative color index");
        }
        if (index >= COMBINATION_SIZE) {
            throw new MastermindException("Combination contains " + COMBINATION_SIZE + " colors");
        }
        return colors[index];
    }

    public boolean contains(CombinationColor color) {
        for (CombinationColor combinationColor : colors) {
            if (combinationColor.equals(color)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Combination that = (Combination) o;
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
