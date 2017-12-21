package exercise14_01.graphics;

public class IsoScelesTriangle extends Triangle {
    private static int count = 0;

    public IsoScelesTriangle() {
        this(0, 0, 0, 0);
    }

    public IsoScelesTriangle(int width, int height) {
        this(width, height, 0, 0);
    }

    public IsoScelesTriangle(int width, int height, int x, int y) {
        this.x = x;
        this.y = y;
        setWidth(width);
        setHeight(height);
        setPend(width / 2);
        count++;
    }

    public IsoScelesTriangle(IsoScelesTriangle tri) {
        this(tri.getWidth(), tri.getHeight(), tri.x, tri.y);
    }

    public void setWidth(int width) {
        super.setWidth(width);
        super.setPend(width / 2);
    }

    public void setPend(int pend) {
        super.setPend(pend);
        super.setWidth(pend * 2);
    }

    public static int getCount() {
        return count;
    }

    protected void finalize() throws Throwable {
        count--;
        super.finalize();
    }

    public String toString() {
        return "Isosceles triangle at position (" + x + "," + y + ") with base " +
                getWidth() + " and height " + getHeight();
    }
}

