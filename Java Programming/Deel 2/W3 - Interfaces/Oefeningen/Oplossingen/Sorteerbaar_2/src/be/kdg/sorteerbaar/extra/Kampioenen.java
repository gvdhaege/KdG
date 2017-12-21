package be.kdg.sorteerbaar.extra;

import java.util.Arrays;

public class Kampioenen implements Sorteerder {
    private Kampioen kampioenen[];

    public Kampioenen(Kampioen[] kampioenen) {
        this.kampioenen = new Kampioen[kampioenen.length];
        this.kampioenen = Arrays.copyOf(kampioenen, kampioenen.length);
    }

    public void sort() {
        BubbleSort.sort(kampioenen);
    }

    public void sortReversed() {
        BubbleSort.sortReversed(kampioenen);
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for (Kampioen kampioen : kampioenen) {
            buffer.append(kampioen).append("\n");
        }
        return buffer.toString();
    }
}

