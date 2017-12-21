package exercise14_01.graphics;

import java.awt.*;

public class Triangle extends Shape {
    private int width;
    private int height;
    private int pend;

    public static final int ANGLES = 3;
    private static int count = 0;

    public Triangle() {
        this(0, 0, 0, 0, 0);
    }

    public Triangle(int width, int height, int pend) {
        this(width, height, pend, 0, 0);
    }

    public Triangle(int width, int height, int pend, int x, int y) {
        this.x = x;
        this.y = y;
        setWidth(width);
        setHeight(height);
        setPend(pend);
        count++;
    }

    public Triangle(Triangle tri) {
        this(tri.width, tri.height, tri.pend, tri.x, tri.y);
    }

    public void setWidth(int width) {
        this.width = width < 0 ? -width : width;
    }

    public void setHeight(int height) {
        this.height = height < 0 ? -height : height;
    }

    public void setPend(int pend) {
        this.pend = pend;
    }

    public double getArea() {
        return (width * height) / 2;
    }

    public double getPerimeter() {
        return width + Math.hypot(height, pend) + Math.hypot(height, (width - pend));
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getPend() {
        return pend;
    }

    public static int getCount() {
        return count;
    }

    protected void finalize() throws Throwable {
        count--;
        super.finalize();
    }

    public boolean equals(Object o) {
        return (o != null) &&
                (o.getClass() == this.getClass()) &&
                (((Triangle) o).height == this.height) &&
                (((Triangle) o).width == this.width) &&
                (((Triangle) o).pend == this.pend);
    }

    public int hashCode() {
        return super.hashCode() ^ height ^ width ^ pend;
    }

    public String toString() {
        return "Triangle at position (" + x + "," + y + ") with base " +
                width + ", height " + height + " and pendicular " + pend;
    }

    public void draw(Graphics g) {
        // TODO Auto-generated method stub

    }

    public void scale(int factor) {
        double f = Math.sqrt(factor) / 10;
        height = (int) (height * f);
        width = (int) (width * f);
    }
}

