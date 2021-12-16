package BasicOOP;

import Encapsulation9_1.Person;

public class Employee extends Person {
	protected String designation;

	public Employee() {
	}

	public Employee(String fn, String ln, String des) {
		super();
		designation = des;
			}

	public static void main(String[] args) {
		Employee d = new Employee("Abhishek", "lacheta", "Student");
		System.out.println("default"+d.designation);
		System.out.println("2parameter"+d.getName());
		System.out.println("3PARAMETER"+d.getName());

	}

}
