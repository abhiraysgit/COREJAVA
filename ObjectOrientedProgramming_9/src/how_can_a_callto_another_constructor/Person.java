package how_can_a_callto_another_constructor;

public class Person {
	protected String firstName = null;
	protected String lastName = null;
	protected String address = null;

	public Person() {
		System.out.println("Person is default con");
	}

	public Person(String fn, String ln) {
		firstName = fn;
		lastName = ln;
		System.out.println(" 2 params constructor is called");
	}

	public Person(String fn, String ln, String address) {
		// firstName = fn;
		// lastName = ln;
		this(fn, ln);
		this.address = address;
		System.out.println(fn + ln + address);
	}

	public static void main(String[] args) {
		Person P = new Person("vikas", "abhi", "indore");
	}
}
