package be.kdg.rechthoekbis;

/**
 * @author Kristiaan Behiels
 * @version 1.1 25/11/13
 */
public class Rechthoek {
    private int breedte;
    private int hoogte;

    public Rechthoek() {
        this(0, 0);
    }

    public Rechthoek(int breedte, int hoogte) throws IllegalArgumentException  {
        setBreedte(breedte);
        setHoogte(hoogte);
     }

    public void setBreedte(int breedte) throws IllegalArgumentException  {
        if (breedte < 0) {
            throw new IllegalArgumentException("Negatieve breedte") ;
        }
        this.breedte = breedte;
    }

    public void setHoogte(int hoogte) throws IllegalArgumentException {
        if (hoogte < 0) {
            throw new IllegalArgumentException("Negatieve hoogte");
        }
        this.hoogte = hoogte;
    }

    @Override
    public String toString() {
        return "Breedte: " + breedte + "  Hoogte: " + hoogte;
    }
}
