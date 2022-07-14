package CollectionsDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(100, "A");
		hashMap.put(7, "B");
		hashMap.put(44, "C");
		hashMap.put(2, "Baba");
		hashMap.put(651, "A");

		System.out.println(" The Key and Values are before sorting");

		for (Map.Entry<Integer, String> map : hashMap.entrySet())
			System.out.println("The Key: " + map.getKey() + "\tThe Value: " + map.getValue());

		TreeMap<Integer, String> sorted = new TreeMap(hashMap);

		System.out.println(" The Key and Values are After sorting");

		for (Map.Entry<Integer, String> map : sorted.entrySet())
			System.out.println("The Key: " + map.getKey() + "\tThe Value: " + map.getValue());
	}

}
