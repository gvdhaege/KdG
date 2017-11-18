package be.kdg.vorm;

/**
 * @author Kristiaan Behiels
 * @version 1.0 19/10/13
 *
 * Oppervlakte = 4*Math.PI*r*r
 *
 * Volume = 4/3*Math.PI*r*r*r
 *
 */
public class Bol extends Vorm {
    private int straal;

    public Bol(String kleur, int straal) {
        super(kleur);
        this.straal = straal;
    }

    public double oppervlakte() {
        return 4 * Math.PI * straal * straal;
    }

    public double volume() {
        return 4.0 / 3 * Math.PI * straal * straal * straal;
    }

    @Override
    public String toString() {
        return String.format("Kleur: %s, straal: %d  oppervlakte: %.3f  volume: %.3f",
                getKleur(), straal, oppervlakte(), volume());
    }
}
