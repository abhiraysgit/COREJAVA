package polymorphism_throw_returrnType;

public class Test1 {
	public static void main(String[] args) {
		Employee e = new Employee();
		e = EmployeeModal1.add();
		System.out.println(e.getAadar());
	}
}
