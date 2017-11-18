package be.kdg.dieren;

/**
 * @author Kristiaan Behiels
 * @version 1.0 20/10/13
 */
public class Basenji extends Hond {
    public Basenji(String kleur, int aantalPoten, String geluid) {
        super(kleur, aantalPoten, "");
    }

    public Basenji getDierKopie() {
        return new Basenji(getKleur(), getAantalPoten(), "");
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), "");
    }
}
