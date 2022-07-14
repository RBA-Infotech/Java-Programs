package CollectionsDemo;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String,String> hashTable = new Hashtable<String,String>();
		
	//	String s1 = sc.nextInt();
		
		hashTable.put("A", "Anbu");
		hashTable.put("B", "Bala");
		hashTable.put("C", "Charulatha");
		hashTable.put("B", "Badsha");
//		hashTable.put(null, "Deva");
		hashTable.put("E", null);
		
		System.out.println("The Key and Values in the Hashtable is:");
		
		for(Map.Entry map : hashTable.entrySet())
			System.out.println("The Key: " + map.getKey() + "\t The value: " + map.getValue());
	}

}
