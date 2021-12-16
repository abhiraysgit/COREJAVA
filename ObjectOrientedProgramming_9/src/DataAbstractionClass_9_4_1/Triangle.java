package DataAbstractionClass_9_4_1;

public class Triangle extends Shape {
	public static void main(String[] args) {
		Triangle T = new Triangle();
		T.setColor("Red");
		T.setBorderwidth(56);
		T.setBase(15);
		T.setHight(5);
		System.out.println("Color of Triangle..." + T.getColor());
		System.out.println("B.W. of Triangle..." + T.getBorderwidth());
		System.out.println("Base of Triangle..." + T.getBase());
		System.out.println("Hight of Triangle..." + T.getHight());
		T.area();

	}

	private int base;
	private int hight;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	@Override
	public void area() {
		double T = base * hight / 2;
		System.out.println("Area of Triangle......" + T);

	}

}
