package The_List_Interface;

import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.offer("Ajay");
		l.offer("kamlesh");
		l.offer("chandan");
		l.offer("");
		l.offer("ranu");
		l.offer("monika");
		l.offer("shivani");
		l.offer("payal");
		l.offer("vijay");
//	System.out.println(l.addAll());
	

		System.out.println(l.size());
	System.out.println(l.peek());
		System.out.println(l.poll());
		System.out.println(l.poll());
		System.out.println(l.poll());
		System.out.println(l.poll());
		System.out.println(l.poll());
		System.out.println(l.poll());
		System.out.println(l.poll());
		System.out.println(l.poll());
		System.out.println(l.poll());
		System.out.println(l.poll());
	System.out.println(l.poll());
	}

}

