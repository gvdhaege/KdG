package be.kdg.customexception;

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

    public Rechthoek(int breedte, int hoogte) throws NegativeSizeException  {
        setBreedte(breedte);
        setHoogte(hoogte);
    }

    public void setBreedte(int breedte) throws NegativeSizeException  {
        if (breedte < 0) {
            throw new NegativeSizeException("Negatieve breedte") ;
        }
        this.breedte = breedte;
    }

    public void setHoogte(int hoogte) throws NegativeSizeException {
        if (hoogte < 0) {
            throw new NegativeSizeException("Negatieve hoogte");
        }
        this.hoogte = hoogte;
    }

    @Override
    public String toString() {
        return "Breedte: " + breedte + "  Hoogte: " + hoogte;
    }
}
