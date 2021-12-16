package methodoverriding;

public class TestShape {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Circle(5);
		s[1] = new Rectangle(6, 7);
		s[2] = new Triangle(4, 7);
		System.out.println("Area of Circle....." + s[0].area());
		System.out.println("Area of Rectangle....." + s[1].area());
		System.out.println("Area of Triangle....." + s[2].area());
		double totalArea = calcArea(s);
		System.out.println(totalArea);
	}

	private static double calcArea(Shape[] s) {
		double totalArea = 0;

		for (int i = 0; i < s.length; i++) {
			totalArea += s[i].area();

		}

		System.out.println("Total Area of Shape....................");
		return totalArea;

	}

}
