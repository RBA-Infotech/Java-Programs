package CollectionsDemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("Raju");
		treeSet.add("Arul");
		treeSet.add("Dhamu");
		treeSet.add("Bala");
		treeSet.add("Raju");
		
		System.out.println("Elements in TreeSet: ");
		for (String str : treeSet) {
			System.out.println(str);
		}
		
		System.out.println("\nDisplaying elements in descending order");
		TreeSet<String> descendingOrder = (TreeSet<String>) treeSet.descendingSet();
		for (String str : descendingOrder) {
			System.out.println(str);
		}
		
	}

}
