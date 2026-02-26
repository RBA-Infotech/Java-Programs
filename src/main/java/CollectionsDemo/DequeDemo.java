package CollectionsDemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		deque.addFirst(10);
		deque.addFirst(20);
		deque.addLast(30);
		deque.addLast(40);
		
		
		
		System.out.println("Elements in Deque: ");
		for (Integer int1 : deque) {
			System.out.println(int1);
		}
	
		System.out.println("\nAfter removing first element");
		deque.removeFirst();
		for (Integer int1 : deque) {
			System.out.println(int1);
		}
	}

}
