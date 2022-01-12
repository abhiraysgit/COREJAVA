package The_Map_Interface;

import java.util.HashMap;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
		HashMap m =new HashMap();
		m.put("RN1001", 890);
		m.put("RN1002", 900);
		m.put("RN1003", 780);
		Integer i=(Integer)m.get("RN1001");
		Set keys =m.keySet();
	}

}
