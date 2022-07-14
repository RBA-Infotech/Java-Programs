package CollectionsDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		
		HashMap<String, String>hashMap = new HashMap<String, String>();
		
//		hashMap.put(99, "A");
//		hashMap.put(199, "B");
//		hashMap.put(199, "C");
//		hashMap.put(45, "ba");
//		hashMap.put(68, "ART");  
//		hashMap.put(234, "E");
		
		hashMap.put("B", "Bala");
		hashMap.put("S", "Sam");
		hashMap.put("D", "Deva");
		hashMap.put("P", "Poornima");
		hashMap.put(null, "Seleniun");
		hashMap.put(null, null);
		hashMap.put("A", null);
		
		//HashMap allows Null key and Null value
		//hashMap1.put(null, null);
		
		System.out.println(" The Key and Values are ");
		
		for(Map.Entry map : hashMap.entrySet())
			System.out.println("The Key: " + map.getKey() + "\tThe Value: " + map.getValue());

	}

}
