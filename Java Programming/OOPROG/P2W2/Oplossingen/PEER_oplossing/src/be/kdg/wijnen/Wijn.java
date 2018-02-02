package be.kdg.wijnen;

/**
 * Mark Goovaerts
 * Datum: 4-11-13
 * Johan Ven
 * Datum: 10-11-14
 */
public class Wijn {
    private String naam;
    private String streek;
    private int jaar;
    private double basisPrijs;

    public Wijn(String naam, String streek, int jaar, double basisPrijs) {
        this.naam = naam;
        this.streek = streek;
        this.jaar = jaar;
        this.basisPrijs = basisPrijs;
    }

    public String getNaam() {
        return naam;
    }

    public String getStreek() {
        return streek;
    }

    public int getJaar() {
        return jaar;
    }

    //Opgave 1.1
    protected double getBasisPrijs() {
        return basisPrijs;
    }

    public double berekenPrijs() {
        //Opgave 1.2
        return getBasisPrijs();
    }

    //Opgave 1.3 (NIEUW TOEGEVOEGD)
    public final String getKenmerken(){
        return String.format("Van %4d, afkomstig uit %s", jaar, streek);
    }

    @Override
    public String toString() {
        //Opgave 1.4 (gebruik String.Format: GEWIJZIGD, was 1.3 is nu 1.4 TOEGEVOEGD)
        return String.format("%-45s € %6.2f \n (%s)", naam, berekenPrijs(), this.getKenmerken());
    }
}
