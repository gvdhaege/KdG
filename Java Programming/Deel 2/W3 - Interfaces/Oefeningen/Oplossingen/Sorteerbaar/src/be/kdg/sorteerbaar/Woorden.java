package be.kdg.sorteerbaar;

import java.util.Arrays;

public class Woorden implements Sorteerder {
    private Woord woorden[];

    public Woorden(Woord[] woorden) {
        this.woorden = new Woord[woorden.length];
        // System.arraycopy(woorden, 0, this.woorden, 0, woorden.length);
        this.woorden = Arrays.copyOf(woorden, woorden.length);
    }

    public Woorden(String[] woorden) {
        this.woorden = new Woord[woorden.length];
        for (int i = 0; i < woorden.length; i++) {
            this.woorden[i] = new Woord(woorden[i]);
        }
    }

    public void sort() {
        BubbleSort.sort(woorden);
    }

    public void sortReversed() {
        BubbleSort.sortReversed(woorden);
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for (Woord woord : woorden) {
            buffer.append(woord).append(" ");
        }
        return buffer.toString();
    }
}

