package CollectionsDemo;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<>();
		
		vector.add("Dhamu");
		vector.add("Poornima");
		vector.add("Boobalan");
		vector.add("Parthiban");
		
		for (String string : vector) {
			System.out.println(string);
		}
				
	}

}
