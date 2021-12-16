package DataAbstractionClass_9_4_1;

public class Circle extends Shape {
	public static void main(String[] args) {
		Circle C = new Circle();
		C.setColor("Green");
		C.setBorderwidth(57);
		C.setRadius(12);
		System.out.println("Color of Circle....." + C.getColor());
		System.out.println("B.W. of Circle....." + C.getBorderwidth());
		System.out.println("Radius of Circle....." + C.getRadius());
		C.area();
	}

	private int radius;
	static final double PI = 3.14;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		double d = PI * radius * radius;
		System.out.println("Area of Circle......"+d);
	}

}
