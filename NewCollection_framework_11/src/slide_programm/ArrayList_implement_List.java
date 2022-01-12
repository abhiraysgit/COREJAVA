package slide_programm;

import java.util.ArrayList;

public class ArrayList_implement_List {
	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		v.add("one");
		v.add("Two");
		v.add("Three");
		Integer i = new Integer(4);// out boxing prosec
		v.add(i);
		Integer value = (Integer) v.get(3);// unboxing prosec
		System.out.println("Index 3 value....." + value);
	}
}
