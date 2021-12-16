package BasicOOP;

public class Calculator {

	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public int sub(int a, int b) {
		int sub = a - b;
		return sub;

	}

	private int multiply(int a, int b) {
		int mul = a * b;
		return mul;

	}

	private int division(int a, int b) {
		int div = a / b;
		return div;

	}

	public static void main(String[] args) {
		Calculator abc = new Calculator();
		int a = abc.add(1000, 1000);
		int b = abc.sub(10, 5);
		int c = abc.multiply(4, 5);
		int d = abc.division(10, 5);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
