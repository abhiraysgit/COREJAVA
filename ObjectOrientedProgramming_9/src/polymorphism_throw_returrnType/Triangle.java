package polymorphism_throw_returrnType;

public class Triangle extends Shape {
	private int base;
	private int hight;

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
	public void area() {
		double A = base * hight / 2;
		System.out.println("Are of Triangle......." + A);
	}
}
