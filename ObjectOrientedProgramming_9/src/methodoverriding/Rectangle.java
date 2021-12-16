package methodoverriding;

public class Rectangle extends Shape {
	private int length;
	private int width;
	private double B=0;

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
	public double area() {
		double B = length * width;
		return B;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(6, 7);
		r.setColor("Yello");
		r.setBorderWidth(10);
		
		System.out.println("Color of Rectangle......" + r.getColor());
		System.out.println("B.W. of Rectangle......" + r.getBorderWidth());
		System.out.println("Length of Rectangle......" + r.getLength());
		System.out.println("Width of Rectangle......" + r.getWidth());
		System.out.println("Area of Rectangle......... 6"+r.area());
	}
}
