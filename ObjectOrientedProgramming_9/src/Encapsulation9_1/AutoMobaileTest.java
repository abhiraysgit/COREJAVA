package Encapsulation9_1;
public class AutoMobaileTest {

	public static void main(String[] args) {
		// AutoMobaile AutoMobaile = new AutoMobaile("Blue", "india", 60);
		// System.out.println(AutoMobaile.getColor());
		// System.out.println(AutoMobaile.getMake());
		// System.out.println(AutoMobaile.getSpeed());

		AutoMobaile m = new AutoMobaile();
		m.setColor("Blue");
		m.setMake("india");
		m.setSpeed(60);

		System.out.println("AutoMobaile color....." + m.getColor());
		System.out.println("AutoMobaile Make......." + m.getMake());
		System.out.println("AutoMobaile Speed ........" + m.getSpeed());

	}

}