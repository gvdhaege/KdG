package be.kdg.sorteerbaar;

public final class Getal implements Sorteerbaar {
    private final int getal;

    public Getal(int getal) {
        this.getal = getal;
    }

    public boolean kleinerDan(Sorteerbaar sorteerbaar) {
        return getal < ((Getal)sorteerbaar).getal;
    }

    public boolean groterDan(Sorteerbaar sorteerbaar) {
        return getal > ((Getal) sorteerbaar).getal;
    }

    @Override
    public String toString() {
        return Integer.toString(getal);
    }
}
