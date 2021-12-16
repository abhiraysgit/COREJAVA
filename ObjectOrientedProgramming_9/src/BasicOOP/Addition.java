package BasicOOP;

public class Addition {// Method overloding
	public void Add(int a, int b) {
		System.out.println(a + b);

	}

	public void Add(int a, int b, int c) {
		System.out.println(a + b+c);
	}

	public void Add(int a, int b, float c) {
		System.out.println(a + b+c);
	}

	public static void main(String[] args) {
		Addition a = new Addition();
		a.Add(3, 6);
		a.Add(4, 8,9.6f);
		a.Add(3, 30, 70);
	}

}
