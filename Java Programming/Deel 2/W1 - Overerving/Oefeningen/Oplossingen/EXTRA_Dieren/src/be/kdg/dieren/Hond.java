package be.kdg.dieren;

/**
 * @author Kristiaan Behiels
 * @version 1.0 20/10/13
 */
public class Hond extends Dier{
    private String geluid = "Woef";

    public Hond(String kleur, int aantalPoten, String geluid) {
        super(kleur, aantalPoten);
        this.geluid = geluid;
    }

    // covariant return type
    @Override
    public Hond getDierKopie() {
        return new Hond(getKleur(), getAantalPoten(), geluid);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Hond hond = (Hond) o;

        return geluid.equals(hond.geluid);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        return 31 * result + geluid.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), geluid);
    }

    public void setGeluid(String geluid) {
        this.geluid = geluid;
    }
}
