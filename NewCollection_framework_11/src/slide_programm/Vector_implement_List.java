package slide_programm;

import java.util.Vector;

public class Vector_implement_List {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("one");
		v.add("two");
		v.add("Three");
		Integer i = new Integer(4);
		v.add(i);
		Integer value = (Integer) v.get(3);
		System.out.println("Index value 3..........." + value);
	}
}
