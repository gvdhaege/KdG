package be.kdg.dierenpoly;

/**
 * @author Kristiaan Behiels
 * @version 1.0 21/10/13
 */
public class Varken extends Dier {
    public Varken(String soort) {
        super(soort);
    }

    @Override
    public String maakGeluid() {
        return "Knor! Knor!";
    }


}
