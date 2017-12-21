package be.kdg.sorteerbaar;

public final class Woord implements Sorteerbaar {
    private final String woord;

    public Woord(String woord) {
        this.woord = woord;
    }

    public boolean kleinerDan(Sorteerbaar sorteerbaar) {
        return woord.compareTo(((Woord) sorteerbaar).woord) < 0;
    }

    public boolean groterDan(Sorteerbaar sorteerbaar) {
        return woord.compareTo(((Woord) sorteerbaar).woord) > 0;
    }

    @Override
    public String toString() {
        return woord;
    }
}
