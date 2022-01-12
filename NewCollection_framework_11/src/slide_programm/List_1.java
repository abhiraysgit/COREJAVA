package slide_programm;

import java.util.ArrayList;

public class List_1 {

	public static void main(String[] args) {
		ArrayList names = new ArrayList();
		for (int i = 0; i < 1000; i++) {
			names.add("No. #" + i);
		}
		System.out.println("Name ....." + names.size());
		Object o = names.get(10);
		String name = (String) o;
		System.out.println("First name is......" + name);
	}
}
