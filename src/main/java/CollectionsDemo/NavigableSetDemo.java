package CollectionsDemo;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NavigableSet<Integer> ns = new TreeSet<>(); 
        ns.add(0); 
        ns.add(5); 
        ns.add(3); 
        ns.add(8); 
        ns.add(7); 
        ns.add(6); 
        ns.add(1); 
  
        // Get a reverse view of the navigable set 
        NavigableSet<Integer> reverseNs = ns.descendingSet(); 
  
        // Print the normal and reverse views 
        System.out.println("Normal order: " + ns); 
        System.out.println("Reverse order: " + reverseNs); 
  
        NavigableSet<Integer> threeOrMore = ns.tailSet(3, true); 
        System.out.println("3 or  more:  " + threeOrMore); 
        System.out.println("lower(3): " + ns.lower(3)); 
        System.out.println("higher(4): " + ns.higher(4)); 
        System.out.println("floor(4): " + ns.floor(4)); 
        System.out.println("ceiling(4): " + ns.ceiling(4)); 
  
        System.out.println("pollFirst(): " + ns.pollFirst()); 
        System.out.println("Navigable Set:  " + ns); 
  
        System.out.println("pollLast(): " + ns.pollLast()); 
        System.out.println("Navigable Set:  " + ns); 
	}

}
