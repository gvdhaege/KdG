package be.kdg.sorteerbaar.extra;

public final class Persoon implements Sorteerbaar {
    private String naam;
    private int leeftijd;

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public boolean kleinerDan(Sorteerbaar sorteerbaar) {
        return leeftijd < ((Persoon)sorteerbaar).leeftijd;
    }

    public boolean groterDan(Sorteerbaar sorteerbaar) {
        return leeftijd > ((Persoon) sorteerbaar).leeftijd;
    }

    @Override
    public String toString() {
        return String.format("%-15s %2d", naam, leeftijd);
    }
}
