package be.kdg.dieren;

/**
 * @author Kristiaan Behiels
 * @version 1.0 20/10/13
 */
public class Dier {
   private String kleur;
   private int aantalPoten;

    public Dier(String kleur, int aantalPoten) {
        this.kleur = kleur;
        this.aantalPoten = aantalPoten;
    }

    public Dier getDierKopie() {
        return new Dier(kleur, aantalPoten);
    }

    public String getKleur() {
        return kleur;
    }

    public int getAantalPoten() {
        return aantalPoten;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Dier dier = (Dier) object;

        return aantalPoten == dier.aantalPoten && kleur.equals(dier.kleur);
    }

    @Override
    public int hashCode() {
        int result = kleur.hashCode();
        return 31 * result + aantalPoten;
    }

    @Override
    public String toString() {
        return String.format("%-12s %d", kleur, aantalPoten);
    }
}
