package be.kdg.wijnen;

/**
 * Mark Goovaerts
 * Datum: 4-11-13
 * Johan Ven
 * Datum: 10-11-14
 */
public class Champagne extends Wijn {
    private Smaak smaak;

    //Opdracht 4.1

    public Champagne(String naam, String streek, int jaar, double basisPrijs, Smaak smaak) {
        super(naam, streek, jaar, basisPrijs);
        this.smaak = smaak;
    }

    //Opdracht 4.2
    @Override
    public double berekenPrijs(){
        if(this.smaak.toString().toLowerCase().contains("brut")){
            return super.berekenPrijs() * 1.10;
        }
        else
            return  super.berekenPrijs();
    }

    //Opdracht 4.3
    @Override
    public String toString(){
        return String.format("%s \n (Type %s)", super.toString(), smaak.toString());
    }
}
