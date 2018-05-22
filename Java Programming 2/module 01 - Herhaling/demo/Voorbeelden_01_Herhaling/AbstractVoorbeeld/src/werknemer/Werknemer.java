package werknemer;

public abstract class Werknemer {
    protected final double UURLOON = 12.5;
    private String naam;
    private long rijksregisterNr;

    public abstract double berekenLoon();

    public Werknemer(String naam, long rijksregisterNr) {
        this.naam = naam;
        this.rijksregisterNr = rijksregisterNr;
    }

    @Override
    public String toString() {
        return "Naam: " + naam + "\nRijksregisterNr: " + rijksregisterNr;
    }
}