package be.kdg.boederij;

/**
 * De klasse Konijn is een uitbreiding van de klasse Dier.
 * Ze bevat als extra attribuut de waarde isGraver (type boolean).
 */
public class Konijn extends Dier {
    private boolean isGraver;

    /**
     *  Constructor (voorzie 'Snif' als geluid en 'gras' als voedsel.
     */
    public Konijn(String naam, boolean graaft) {
        super(naam, "Snif", "gras");
        this.isGraver = graaft;
    }

    /**
     * Voorzie een toString methode (zie voorbeeld)
     * Voorbeeld: Bugs maakt geluid Snif, eet gras en graaft wel.
     */
    public String toString() {
        return super.toString() + " en graaft " +
            (isGraver ? "wel" : "niet");
        /* String s = super.toString() + " en graaft ";
        if (isGraver)
            s += "wel";
        else
            s += "niet";
        return s; */
    }
}
