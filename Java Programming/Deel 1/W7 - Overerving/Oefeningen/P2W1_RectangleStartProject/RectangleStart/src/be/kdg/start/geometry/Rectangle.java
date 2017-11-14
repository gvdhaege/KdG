package be.kdg.start.geometry;

public class Rectangle {
    // Fields (= variabelen, attributen)
    private int x;
    private int y;
    private int height;
    private int width;
    public String description = "Rectangle";

    // Constructors
    public Rectangle() {
        this(5, 5);
    }

    public Rectangle(int height, int width) {
        this(1, 1, height, width);
    }

    public Rectangle(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public Rectangle(Rectangle rectangleToCopy) {
        this(rectangleToCopy.getX(), rectangleToCopy.getY(), rectangleToCopy.getHeight(), rectangleToCopy.getWidth());
    }

    // Methods
    public void grow(int growOfWidth, int growOfHeight) {
        width += growOfWidth;
        height += growOfHeight;
    }

    public void grow(int growSize) {
        this.grow(growSize, growSize);
    }

    // Getters en setters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return (2 * width) + (2 * height);
    }

    @Override
    public String toString() {
        return String.format("Rectangle at (%d, %d), Width: %d, Height: %d"
                , getX(), getY(), getWidth(), getHeight());
    }
}
