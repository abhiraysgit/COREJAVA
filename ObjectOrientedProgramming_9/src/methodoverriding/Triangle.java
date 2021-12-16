package methodoverriding;

public class Triangle extends Shape {
	private int base;
	private int hight;
	private double d = 0;

	public Triangle(int base, int hight) {
		this.base = base;
		this.hight = hight;
	}

	public int getBase() {
		return base;
	}

	public int getHight() {
		return hight;
	}

	@Override
	public double area() {
		// super.area();
		double d = 0.5 * base * hight;
		return d;
	}

	public static void main(String[] args) {
		Triangle T = new Triangle(4, 7);
		T.setColor("Green");
		T.setBorderWidth(6);

		System.out.println("Color of Triangle......" + T.getColor());
		System.out.println(" BorderWidth of Triangle........" + T.getBorderWidth());
		System.out.println("Base of Triangle...... " + T.getBase());
		System.out.println("Hight of Triangle........" + T.getHight());

		System.out.println("Area of Triangle........... " + T.area());
	}

}
