package be.kdg.punt4;

/**
 * @author Kristiaan Behiels
 * @version 1.0 19/10/13
 */
public class Punt {
    private int x;
    private int y;

    public Punt() {
    }

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Punt punt = (Punt) object;

        return x == punt.x && y == punt.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        return 31 * result + y;
    }

    @Override
    public String toString() {
        return "x: " + x  + "  y: " +  y;
    }
}
