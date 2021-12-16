package methodoverloading;

public class Addition {
	private int Add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	private double Add(double a, double b) {
		double sum = a + b;
		return sum;
	}

	private float Add(float a, float b) {
		float sum = a + b;
		return sum;
	}

	private double Add(int c, double d) {
		double result = c + d;
		return result;
	}

	public static void main(String[] args) {
		Addition abc = new Addition();
		int a = abc.Add(10, 30);
		System.out.println(" Addition of first ...." + a);
		double b = abc.Add(14.3, 15.7);
		System.out.println("Addition of second ...." + b);
		float c = (float) abc.Add(14.5, 454.5);
		System.out.println("Addition of third...." + c);
		double d = abc.Add(12, 12.3);
		System.out.println("Addition of four...." + d);
	}

}
