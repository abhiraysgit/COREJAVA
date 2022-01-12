package The_List_Interface;

import java.util.ArrayList;
import java.util.List;

public class TestVector_3 {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("ajay");
		l.add(35);
		l.add(4.5);
		l.add('x');
		l.add("vijay");
		l.add(37);
		l.add(5.8);
		l.add('y');
		System.out.println(l.get(0));
		System.out.println(l);
		System.out.println(l.subList(3, 8));
	}
}
