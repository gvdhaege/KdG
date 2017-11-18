public class Punt3D  extends Punt{
    private int z;

    public Punt3D(){

    }

    public Punt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public String toString(){
        return "Punt3D: x = " + getX() + ", y = " + getY() + ", z = " + z;
    }
}
