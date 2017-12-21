package be.kdg.sorteerbaar;

public class Getallen implements Sorteerder {
    private Getal getallen[];

    /*public Getallen(Getal[] getallen) {
        this.getallen = new Getal[getallen.length];
        System.arraycopy(getallen, 0, this.getallen, 0, getallen.length);
    }*/

    public Getallen(int[] getallen) {
        this.getallen = new Getal[getallen.length];
        for (int i = 0; i < getallen.length; i++) {
            this.getallen[i] = new Getal(getallen[i]);
        }
    }

    public void sort() {
       BubbleSort.sort(getallen);
    }

    public void sortReversed() {
       BubbleSort.sortReversed(getallen);
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for (Getal getal : getallen) {
            buffer.append(getal.toString()).append(" ");
        }
        return buffer.toString();
    }
}
