package be.kdg.vorm;

/**
 * @author Kristiaan Behiels
 * @version 1.0 19/10/13
 */
public abstract class Vorm {
    private String kleur;

    protected Vorm(String kleur) {
        this.kleur = kleur;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public abstract double oppervlakte();

    public abstract double volume();

}
