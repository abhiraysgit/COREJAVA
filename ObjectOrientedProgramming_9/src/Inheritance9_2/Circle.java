package Inheritance9_2;

public class Circle extends Shape {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	private void area() {
		double d = 3.14 * radius * radius;
		System.out.println("Cicle area......." + d);
	}

	public static void main(String[] args) {
		Circle c = new Circle();
		c.setColor("red");
		c.setBorderWidth(5);
		c.setRadius(3);
		System.out.println("Circle color....." + c.getColor());
		System.out.println("Circle borderwidth........" + c.getBorderWidth());
		System.out.println("Cicle radius.......... " + c.getRadius());
		c.area();

	}

}
