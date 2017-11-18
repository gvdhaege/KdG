package be.kdg.vorm;

/**
 * @author Kristiaan Behiels
 * @version 1.0 19/10/13
 *
 *  Oppervlakte = z*z + 2z*Math.sqrt((z/2)*(z/2) + h*h);
 *  Volume = (z*z*h)/3;
 *
 */
public class Piramide extends Vorm{
    private int zijde;
    private int hoogte;

    public Piramide(String kleur, int zijde, int hoogte) {
        super(kleur);
        this.zijde = zijde;
        this.hoogte = hoogte;
    }

    public void setZijde(int zijde) {
        this.zijde = zijde;
    }

    public void setHooogte(int hoogte) {
        this.hoogte = hoogte;
    }

    public double oppervlakte() {
        return zijde * zijde + 2 * zijde * Math.sqrt((zijde / 2.0) * (zijde / 2.0) + hoogte * hoogte);
    }

    public double volume() {
        return (zijde * zijde * hoogte) / 3.0;
    }

    @Override
    public String toString() {
        return String.format("Kleur: %s, zijde: %d, hoogte: %d  oppervlakte: %.3f  volume: %.3f",
                getKleur(), zijde, hoogte, oppervlakte(), volume());
    }


}
