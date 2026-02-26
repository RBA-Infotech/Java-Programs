package CollectionsDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Float> h1 = new HashSet<Float>();
		
		h1.add(3.14f);
		h1.add(5.432f);
		h1.add(892.214f);
		h1.add(3.14f); 
		
		System.out.println("The elements are: ");
		for(Float f : h1)
			System.out.print(f + "\n");
		
		System.out.println("\n");
		
		h1.remove(5.432f);
		
		System.out.println("\nThe elements after removing 5.432 ");
		for(Float f : h1)
			System.out.print(f + "\n");
	}

}
