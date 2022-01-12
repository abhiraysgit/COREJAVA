package CollectionSlide_222;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class TestMarksheet {
public static void main(String[] args) {
	Marksheet m1 =new Marksheet();
	m1.setFname("Abhishek");
	m1.setLname("Lacheta");
	m1.setRollNO("1201");
	m1.setChemistry(65);
	m1.setPhysics(55);
	m1.setMaths(78);
	
	Marksheet m2 = new Marksheet();
	
	
	ArrayList l = new ArrayList();
	l.add(m1);
	l.add(m2);
	
}
}
