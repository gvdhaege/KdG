package be.kdg.woorden;

/**
 * @author Kristiaan Behiels
 * @version 1.0 24/10/13
 */
public class Woord {
    private static int aantalWoorden = 0;
    private String woord;

    public Woord(String woord) {
        this.woord = woord;
        aantalWoorden++;
    }

    public String getWoord() {
        return woord;
    }

    public void setWoord(String woord) {
        this.woord = woord;
    }

    public static int getAantalWoorden() {
        return aantalWoorden;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Woord woord1 = (Woord) object;

        return woord.equals(woord1.woord);
    }

    @Override
    public int hashCode() {
        return woord.hashCode();
    }

    // Je mag geen toString methode overriden!

}
