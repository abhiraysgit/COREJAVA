package BasicOOP;

public class Calculator1 {
	int sum;// Global Variable

	public void setAddition(int a, int b) {

		sum = a + b;
	}

	public int getAddition() {

		return sum;
	}

	public static void main(String[] args) {

		Calculator1 Mahak = new Calculator1();
		Mahak.setAddition(10, 20);
		int sum = Mahak.getAddition();
		System.out.println("Mahak Calculator Addition....." + sum);

		Calculator1 Payal = new Calculator1();
		Payal.setAddition(11, 11);
		int sum1 = Payal.getAddition();
		System.out.println("Payal Calculator Addition....." + sum1);

		Calculator1 Shivani = new Calculator1();
		Shivani.setAddition(55, 55);
		int sum2 = Shivani.getAddition();
		System.out.println("Shivani Calculator Addition....." + sum2);
	}
}