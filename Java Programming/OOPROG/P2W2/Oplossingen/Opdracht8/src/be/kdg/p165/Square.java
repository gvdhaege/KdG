package be.kdg.p165;

public class Square extends Rectangle {
	private static int count = 0;

	public static int getCount() {
		return count;
	}

	public Square() {
		this(0, 0, 0);
	}

	public Square(int side) {
		this(side, 0, 0);
	}

	public Square(int side, int x, int y) {
		super(side, side, x, y);
		count++;
	}

	public Square(Square square) {
		this(square.getSide(), square.x, square.y);
	}

	public int getSide() {
		return getHeight();
	}

	public void setSide(int side) {
		super.setHeight(side);
		super.setWidth(side);
	}

	public void setHeight(int height) {
		setSide(height);
	}

	public void setWidth(int width) {
		setSide(width);
	}

	protected void finalize() throws Throwable {
		count--;
		super.finalize();
	}

	public String toString() {
		return "Square with side " + getSide() + " at position ("
				+ x + "," + y + ")";
	}
}
