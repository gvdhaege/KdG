package wijnen;

/**
 * PEER opdracht
 * P2W2
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
    public double getBasisPrijs() {
        return basisPrijs;
    }

    public double berekenPrijs() {
        //Opgave 1.2
        return 0.0;
    }

    //Opgave 1.3
    public String getKenmerken(){
        return "";
    }

    @Override
    public String toString() {
        //Opgave 1.4
        return "";
    }
}
