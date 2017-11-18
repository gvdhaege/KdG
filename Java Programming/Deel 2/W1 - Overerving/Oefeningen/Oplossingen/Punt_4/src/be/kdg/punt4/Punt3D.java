package be.kdg.punt4;

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

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Punt3D punt3D = (Punt3D) object;

        return z == punt3D.z;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        return 31 * result + z;
    }

    @Override
    public String toString() {
        return super.toString() + "  z: " + z;
    }



}
