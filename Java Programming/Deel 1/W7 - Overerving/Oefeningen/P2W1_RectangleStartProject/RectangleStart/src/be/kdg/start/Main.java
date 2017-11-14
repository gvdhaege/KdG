package be.kdg.start;

import be.kdg.start.geometry.Rectangle;
import be.kdg.start.geometry.Square;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 1, 10, 20);

        rectangle.grow(5);

        System.out.println(rectangle.toString());
        System.out.printf("Area: %-5dPerimeter: %-5d%n", rectangle.getArea(), rectangle.getPerimeter());

        Square square = new Square();
        square.setPosition(10, 20);
        System.out.println(square.toString());

        Rectangle rectangle1 = new Rectangle();
        System.out.println("Description: " + rectangle1.description);
        Square square1 = new Square();
        System.out.println("Description: " + square1.description);

        Square square2 = new Square();
        square2.setSize(3);
        System.out.printf("w: %d - h: %d%n", square2.getWidth(), square2.getHeight());
        square2.setWidth(4);
        System.out.printf("w: %d - h: %d%n", square2.getWidth(), square2.getHeight());
        square2.setHeight(5);
        System.out.printf("w: %d - h: %d%n", square2.getWidth(), square2.getHeight());
        square2.setPosition(10,20);
        System.out.println(square2.toString());
    }
}
