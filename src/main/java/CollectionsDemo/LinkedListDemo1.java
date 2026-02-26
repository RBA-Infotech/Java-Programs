package CollectionsDemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Character> ll = new LinkedList<>();
		
		ll.add('X');
		ll.add('$');
		ll.add('A');
		ll.add('d');
		ll.add('8');
		
		System.out.println("Elements in list: ");
		
		for (Character ch: ll) {
			System.out.println(ch);
		}
		
		System.out.println("\nAdding element at position 1");
		ll.add(1, 'Y');
		for (Character ch: ll) {
			System.out.println(ch);
		}
		
		System.out.println("\nRetrieve element at position 3");
		System.out.println(ll.get(3));
		
		System.out.println("\nAfter removing element $");
		ll.remove(2);
		for (Character ch: ll) {
			System.out.println(ch);
		}
	
	}

}
