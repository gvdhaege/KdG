package exercise14_01.graphics;

import java.awt.*;

public class Rectangle extends Shape {
    private int width;

    private int height;

    public static final int ANGLES = 4;

    private static int count = 0;

    public Rectangle() {
        this(0, 0, 0, 0);
    }

    public Rectangle(int width, int height) {
        this(width, height, 0, 0);
    }

    public Rectangle(int width, int height, int x, int y) {
        setWidth(width);
        setHeight(height);
        this.x = x;
        this.y = y;
        count++;
    }

    public Rectangle(Rectangle rect) {
        this(rect.width, rect.height, rect.x, rect.y);
    }

    public void setWidth(int width) {
        this.width = (width < 0) ? -width : width;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = (height < 0) ? -height : height;
    }

    public int getHeight() {
        return height;
    }

    public void grow(int dw, int dh) {
        width += dw;
        height += dh;
        if (width < 0)
            width = 0;
        if (height < 0)
            height = 0;
    }

    public void grow(int d) {
        this.grow(d, d);
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) << 1;
    }

    public static int getCount() {
        return count;
    }

    protected void finalize() throws Throwable {
        count--;
        super.finalize();
    }

    public boolean equals(Object o) {
        return ((o != null) && (o.getClass() == this.getClass())
                && (((Rectangle) o).x == this.x)
                && (((Rectangle) o).y == this.y)
                && (((Rectangle) o).width == this.width) && (((Rectangle) o).height == this.height));
    }

    public int hashCode() {
        return x ^ y ^ width ^ height;
    }

    public String toString() {
        return "Rectangle with width " + width + " and height "
                + height + " at position (" + x + "," + y + ")";
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
