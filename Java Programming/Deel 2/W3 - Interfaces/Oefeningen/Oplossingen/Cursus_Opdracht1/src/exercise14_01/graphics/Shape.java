package exercise14_01.graphics;

public abstract class Shape implements Drawable {
    public int x;
    public int y;
    private static int count = 0;

    public Shape() {
        count++;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public static int getCount() {
        return count;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    protected void finalize() throws Throwable {
        count--;
        super.finalize();
    }
}
