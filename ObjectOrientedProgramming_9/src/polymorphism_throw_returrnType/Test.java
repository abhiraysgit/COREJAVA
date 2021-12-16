package polymorphism_throw_returrnType;

public class Test {
	public static void main(String[] args) {

		ShapeModal1 Modal1 = new ShapeModal1();
		Shape s = new Shape();
		s = Modal1.getshape(2);
		s.area();
	}
}
