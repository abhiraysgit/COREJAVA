package The_List_Interface;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList_1 {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("Payal");
		l.add('A');
		l.add(45);
		l.add(45.77);
		//l.add(2, "Shivani");
		l.set(2, "Shivani");
		l.remove(0);
		System.out.println(l);
	//	System.out.println(l.get(0));
		//System.out.println(l.get(1));

	}
}
