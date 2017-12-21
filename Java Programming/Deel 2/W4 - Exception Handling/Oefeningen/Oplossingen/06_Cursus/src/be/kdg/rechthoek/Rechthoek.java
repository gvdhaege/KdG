package be.kdg.rechthoek;

/**
 * @author Kristiaan Behiels
 * @version 1.0 17/11/13
 */
public class Rechthoek {
    private int breedte;
    private int hoogte;

    public Rechthoek() {
        this(0, 0);
    }

    public Rechthoek(int breedte, int hoogte) throws IllegalArgumentException {
        if (breedte < 0) {
            throw new IllegalArgumentException("Negatieve breedte") ;
        }
        if (hoogte < 0) {
                throw new IllegalArgumentException("Negatieve hoogte");
        }
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    @Override
    public String toString() {
        return "Breedte: " + breedte + "  Hoogte: " + hoogte;
    }
}
