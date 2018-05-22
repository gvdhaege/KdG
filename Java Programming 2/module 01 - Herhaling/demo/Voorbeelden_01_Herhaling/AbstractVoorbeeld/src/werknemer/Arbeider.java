package werknemer;

public class Arbeider extends Werknemer {
    private final int MAX_UREN_PER_WEEK = 38;
    private int aantalUren;

    public Arbeider(String naam, long rijksregisterNr, int aantalUren) {
        super(naam, rijksregisterNr);
        this.aantalUren = aantalUren;
    }

    @Override
    public double berekenLoon() {
        if(aantalUren <= MAX_UREN_PER_WEEK) { //geen overuren
            return UURLOON * aantalUren;
        }
        else { //wel overuren
            int overuren = aantalUren - MAX_UREN_PER_WEEK;
            int gewoneUren = MAX_UREN_PER_WEEK;
            return (UURLOON * 1.5 * overuren) + (UURLOON * gewoneUren);
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("\nLoon: € %.1f", berekenLoon());
    }
}
