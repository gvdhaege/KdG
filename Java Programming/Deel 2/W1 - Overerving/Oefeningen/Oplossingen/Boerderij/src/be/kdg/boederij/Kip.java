package be.kdg.boederij;

/**
 * De klasse Kip is een uitbreiding van de klasse Dier.
 * Ze bevat het extra attribuut aantalEierenPerWeek (type int).
 */
public class Kip extends Dier {
    private int aantalEierenPerWeek;

    /**
     *  Constructor (voorzie 'Toktok' als geluid en 'mais' als voedsel.
     */
    public Kip(String naam, int aantal) {
        super(naam, "Toktok", "mais");
        aantalEierenPerWeek = aantal;
    }

    /**
     * Voorzie een toString methode (zie voorbeeld)
     * Voorbeeld: Generaal Kiekens maakt geluid Toktok, eet mais en legt 4 eieren per week
     */
    public String toString() {
        return super.toString() + " en legt " + aantalEierenPerWeek + " eieren per week";
    }
}
