package CollectionsDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		// HashMap example
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Apple", 10);
		hashMap.put("Banana", 20);
		hashMap.put("Orange", 30);
		hashMap.put("Grape", 40);

		System.out.println("HashMap elements:");
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// LinkedHashMap example
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Apple", 10);
		linkedHashMap.put("Banana", 20);
		linkedHashMap.put("Orange", 30);
		linkedHashMap.put("Grape", 40);

		System.out.println("\nLinkedHashMap elements:");
		for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
