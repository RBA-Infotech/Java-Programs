package BasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<>();
		
		map.put(100, "Arun");
		map.put(200, "Bala");
		map.put(300, "Chandu");
		
		for (Map.Entry m1 : map.entrySet()) {
			
			System.out.println("Key: " + m1.getKey() + "Value: " + m1.getValue());
		}
	}

}
