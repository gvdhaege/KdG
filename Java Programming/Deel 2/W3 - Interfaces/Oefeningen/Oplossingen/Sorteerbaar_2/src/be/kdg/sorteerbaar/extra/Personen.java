package be.kdg.sorteerbaar.extra;

import java.util.Arrays;

public class Personen implements Sorteerder {
    private Persoon personen[];

    public Personen(Persoon[] personen) {
        this.personen = new Persoon[personen.length];
        this.personen = Arrays.copyOf(personen, personen.length);
    }

    public void sort() {
       BubbleSort.sort(personen);
    }

    public void sortReversed() {
       BubbleSort.sortReversed(personen);
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for (Persoon persoon : personen) {
            buffer.append(persoon).append("\n");
        }
        return buffer.toString();
    }
}
