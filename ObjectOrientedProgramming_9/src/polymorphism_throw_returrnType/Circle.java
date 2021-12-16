package polymorphism_throw_returrnType;

public class Circle extends Shape {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public void area() {
		double d = 3.14 * radius * radius;
		System.out.println(" Area of circle..........." + d);
	}
}
