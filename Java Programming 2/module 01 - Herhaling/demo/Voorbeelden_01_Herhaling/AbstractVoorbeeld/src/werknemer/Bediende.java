package werknemer;

public class Bediende extends Werknemer {
    private final int LOONFACTOR = 192;
    private double weddeBarema;

    public Bediende(String naam, long rijksregisterNr, double weddeBarema) {
        super(naam, rijksregisterNr);
        this.weddeBarema = weddeBarema;
    }

    @Override
    public double berekenLoon() {
        return UURLOON * LOONFACTOR * weddeBarema;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("\nLoon: € %.1f", berekenLoon());
    }
}