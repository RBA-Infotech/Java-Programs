package CollectionsDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Float> hashSet = new HashSet<Float>();
		
		hashSet.add(3.14f);
		hashSet.add(5.432f);
		hashSet.add(892.214f);
		hashSet.add(3.14f); 
		
		System.out.println("The elements are: ");
		for(Float f : hashSet)
			System.out.print(f + "\n");
		
		System.out.println("\n");
		
		hashSet.remove(5.432f);
		
		System.out.println("\nThe elements after removing: ");
		for(Float f : hashSet)
			System.out.print(f + "\n");
	}

}
