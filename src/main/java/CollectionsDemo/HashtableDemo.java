package CollectionsDemo;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> hashTable = new Hashtable<String,String>();
		
		hashTable.put("A", "Anbu");
		hashTable.put("B", "Dhamu");
		hashTable.put("C", "Charulatha");
		hashTable.put("B", "Badsha");
//		hashTable.put(null, "Deva"); // null key now allowed
//		hashTable.put("E", null); // null value also not allowed
		
		System.out.println("The Key and Values in the Hashtable is:");
		
		for(Map.Entry map : hashTable.entrySet())
			System.out.println("The Key: " + map.getKey() + "\t The value: " + map.getValue());
	}

}
