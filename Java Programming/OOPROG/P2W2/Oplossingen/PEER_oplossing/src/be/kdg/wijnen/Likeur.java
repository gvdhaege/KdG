package be.kdg.wijnen;

/**
 * Mark Goovaerts
 * Datum: 4-11-13
 * Johan Ven
 * Datum: 10-11-14
 */
public class Likeur extends Wijn  {
    private double alcoholGehalte; //in procent

    //Opdracht 2.1

    public Likeur(String naam, String streek, int jaar, double basisPrijs, double alcoholGehalte) {
        super(naam, streek, jaar, basisPrijs);
        this.alcoholGehalte = alcoholGehalte;
    }

    //Opdracht 2.2
    @Override
    public double berekenPrijs(){
        if(alcoholGehalte >= 0.5){
            return super.berekenPrijs() * 1.25;
        }
        else {
            return super.berekenPrijs();
        }
    }

    //Opdracht 2.3
    @Override
    public String toString(){
        return String.format("%s => alc %2d%%", super.toString(), (int)(alcoholGehalte *100));
    }
}
