package be.kdg.dieren;

/**
 * @author Kristiaan Behiels
 * @version 1.0 20/10/13
 */
public class Kat extends Dier {
    private String geluid = "Miauw";

    public Kat(String kleur, int aantalPoten, String geluid) {
        super(kleur, aantalPoten);
        this.geluid = geluid;
    }

    // covariant return type
    @Override
    public Kat getDierKopie() {
        return new Kat(getKleur(), getAantalPoten(), geluid);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Kat kat = (Kat) object;

        return geluid.equals(kat.geluid);
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
