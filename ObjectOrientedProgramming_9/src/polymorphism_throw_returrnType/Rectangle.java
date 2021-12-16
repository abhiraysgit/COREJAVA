package polymorphism_throw_returrnType;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public void area() {
		double B = length * width;
		System.out.println("Area of Rectangle..........." + B);
	}
}
