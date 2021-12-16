package BasicOOP;

public class Usegettersetter {
	int sum = 0;

	public static void main(String[] args) {
		Usegettersetter a = new Usegettersetter();
		a.setAdd(12, 4);
		int d = a.getAdd();
		System.out.println(d);

	}

	public void setAdd(int a, int b) {
		sum = a + b;
	}

	public int getAdd() {
		return sum;

	}
}
