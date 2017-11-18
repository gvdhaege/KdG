package be.kdg.boederij;

/**
 * De klasse Koe is een uitbreiding van de klasse Dier.
 * Ze bevat aantalLiterMelkPerDag als extra attribuut (type int).
 */
public class Koe extends Dier {
    private int aantalLiterMelkPerDag;

    /**
     *  Constructor (voorzie 'Boe' als geluid en 'gras' als voedsel.
     */
    public Koe(String naam, int aantal) {
        super(naam, "Boe", "gras");
        aantalLiterMelkPerDag = aantal;
    }

    /**
     * Voorzie een toString methode (zie voorbeeld)
     * Voorbeeld: Belle maakt geluid Boe, eet gras en geeft 15 liter melk per dag
     */
    public String toString() {
        return super.toString() + " en geeft " + aantalLiterMelkPerDag + " melk per dag";
    }
}
