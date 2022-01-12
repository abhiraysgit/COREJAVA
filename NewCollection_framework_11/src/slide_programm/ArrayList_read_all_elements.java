package slide_programm;

import java.util.ArrayList;

public class ArrayList_read_all_elements {
	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		v.add("Ajay");
		v.add("pritesh");
		v.add("kamal");
		v.add("Ram");
		v.add("Manish");
		v.add("Aakash");
		v.add("Payal");
		v.add("shivani");
		v.add("monika");
		v.add("Aanshika");
		v.add("kirti");
		v.add("Nikita");
		int size = v.size();
		for (int i = 0; i < size; i++) {
			System.out.println(i + "........" + v.get(i));

		}
	}
}
