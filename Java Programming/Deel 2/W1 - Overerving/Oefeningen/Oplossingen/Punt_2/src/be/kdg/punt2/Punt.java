package be.kdg.punt2;

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

    @Override
    public String toString() {
        return "(" + x  + "," + y  + ")";
    }

}
