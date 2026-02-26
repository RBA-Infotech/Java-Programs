package CollectionsDemo;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> treeMap = new TreeMap<>();

		treeMap.put(7, "Deva");
		treeMap.put(2, "Anbu");
		treeMap.put(4, "Poornima");
		treeMap.put(3, "Sathish");
		
		System.out.println(" The Keys and Values in ascending order");

		for (Map.Entry<Integer, String> map : treeMap.entrySet())
			System.out.println("The Key: " + map.getKey() + "\tThe Value: " + map.getValue());
	
		
		TreeMap<Integer, String> revTreeMap = new TreeMap<>(Comparator.reverseOrder());
		revTreeMap.putAll(treeMap);
		
		System.out.println(" The Key and Values are in descending order");

		for (Map.Entry<Integer, String> map : revTreeMap.entrySet())
			System.out.println("The Key: " + map.getKey() + "\tThe Value: " + map.getValue());
	}

}
