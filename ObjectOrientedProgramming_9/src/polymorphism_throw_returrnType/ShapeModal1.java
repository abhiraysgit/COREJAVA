package polymorphism_throw_returrnType;

public class ShapeModal1 {

	public Shape getshape(int i) {
		Shape shape = new Shape();
		if (i == 1) {
			shape = new Circle(5);
		}
		if (i == 2) {
			shape = new Triangle(4,5);
		}
		if(i==3) {
			shape =new Rectangle(7,8);
		}
		return shape;
	}
}
