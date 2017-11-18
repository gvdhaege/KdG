package be.kdg.punt2;

/**
 * @author Kristiaan Behiels
 * @version 1.0 19/10/13
 */
public class Punt3D extends Punt {
    private int z;

    public Punt3D() {
    }

    public Punt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
       return "(" + getX()  + "," + getY()  +  "," + z + ")";
    }

}
