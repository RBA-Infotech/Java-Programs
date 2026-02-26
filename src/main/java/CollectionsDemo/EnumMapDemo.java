package CollectionsDemo;

import java.util.EnumMap;
import java.util.Map;


public class EnumMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EnumMap<Months, String> enumMap = new EnumMap<>(Months.class);
		
		enumMap.put(Months.Jan, "First Month");
		enumMap.put(Months.Feb, "Second Month");
		enumMap.put(Months.Mar, "Third Month");
		
		for (Map.Entry map : enumMap.entrySet()) {
			System.out.println(map.getKey() + "\t" + map.getValue());
			
		}

	}

}
