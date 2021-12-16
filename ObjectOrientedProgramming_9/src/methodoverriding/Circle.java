package methodoverriding;

public class Circle extends Shape {
	private int radius;
	private double A = 0;

	public int getRadius() {
		return radius;
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		double A = 3.14 * radius * radius;
		return A;
	}

	public static void main(String[] args) {
		Circle c = new Circle(5);
		c.setColor("Red");
		c.setBorderWidth(8);
		
		System.out.println("Color of Circle......" + c.getColor());
		System.out.println("borderWidth  of Circle......" + c.getBorderWidth());
		System.out.println("Radius of Circle......" + c.getRadius());
		System.out.println("Area of Circle "+c.area());

	}
}
