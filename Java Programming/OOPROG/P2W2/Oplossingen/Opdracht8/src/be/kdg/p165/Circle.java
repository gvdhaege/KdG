package be.kdg.p165;

public class Circle extends Shape {
	private int radius;

	public static final int ANGLES = 0;

	private static int count = 0;

	public Circle() {
		this(0, 0, 0);
	}

	public Circle(int radius) {
		this(radius, 0, 0);
	}

	public Circle(int radius, int x, int y) {
		setRadius(radius);
		this.x = x;
		this.y = y;
		count++;
	}

	public Circle(Circle circ) {
		this(circ.radius, circ.x, circ.y);
	}

	public void setRadius(int radius) {
		this.radius = (radius < 0) ? -radius : radius;
	}

	public int getRadius() {
		return radius;
	}

	public void grow(int dr) {
		radius += dr;
		if (radius < 0)
			radius = 0;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
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
				&& (((Circle) o).x == this.x)
				&& (((Circle) o).y == this.y) && (((Circle) o).radius == this.radius));
	}

	public int hashCode() {
		return x ^ y ^ radius;
	}
	
	public String toString() {
		return "Circle with radius " + radius + " at position (" + x + "," + y + ")";
	}
}
