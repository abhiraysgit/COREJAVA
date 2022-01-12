package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Testiterator {
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
		Iterator it = v.iterator();
		while (it.hasNext()) {
			Object o =  it.next();
			System.out.println(o);
		}

	}
}
