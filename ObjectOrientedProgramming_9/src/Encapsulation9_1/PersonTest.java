package Encapsulation9_1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonTest {
	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
		d = sf.parse("17/07/2002");

		Person P = new Person();
		P.setName("Ankit");
		P.setAddress("Manawar");
		System.out.println("Person Name....." + P.getName());
		System.out.println("Person date of birth....." + d);
		System.out.println("Person Address ....." + P.getAddress());
	}
}
