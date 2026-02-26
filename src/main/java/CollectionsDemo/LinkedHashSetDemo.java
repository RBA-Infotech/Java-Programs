package CollectionsDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] arg) {
		// HashSet example
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Orange");
		hashSet.add("Grape");
		hashSet.add("Banana");

		System.out.println("HashSet elements:");
		for (String fruit : hashSet) {
			System.out.println(fruit);
		}

		// LinkedHashSet example
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Apple");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Orange");
		linkedHashSet.add("Grape");
		linkedHashSet.add("Orange");
		
		System.out.println("\nLinkedHashSet elements:");
		for (String fruit : linkedHashSet) {
			System.out.println(fruit);
		}
	}
}
