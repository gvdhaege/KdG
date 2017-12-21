package exercise14_01;

import exercise14_01.graphics.Circle;
import exercise14_01.graphics.Rectangle;
import exercise14_01.graphics.Square;

public class EqualsApp {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 20, 30, 40);
		Rectangle r2 = new Rectangle(15, 25, 40, 50);
		Rectangle r3 = new Rectangle(10, 20, 30, 40);
		Rectangle r4 = new Rectangle(20, 20, 30, 40);

		Square s1 = new Square(20, 30, 40);
		Square s2 = new Square(25, 40, 50);

		Circle c1 = new Circle(20, 30, 40);
		Circle c2 = new Circle(25, 40, 50);

		System.out.println(r1.equals(r1));
		System.out.println(r1.equals(r2));
		System.out.println(r4.equals(s1));

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s2));

		System.out.println(c1.equals(c2));

		System.out.println(r1.equals(r2));

	}
}
