package Inheritance9_2;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	private void area() {
		double area = length * width;
		System.out.println("Rectangle area......" + area);

	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setColor("Blue");
		r.setBorderWidth(6);
		r.setLength(5);
		r.setWidth(7);
		System.out.println("Rectangle color......" + r.getColor());
		System.out.println("Rectangle borderwidth........" + r.getBorderWidth());
		System.out.println("Rectangle length......." + r.getLength());
		System.out.println("Rectangle width........." + r.getWidth());
		r.area();

	}
}
