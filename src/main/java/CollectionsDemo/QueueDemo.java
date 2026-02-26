package CollectionsDemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queue = new LinkedList<>();

		queue.add("Lion");
		queue.add("Tiger");
		queue.add("Cheeta");

		System.out.println("Elements in Queue are : ");
		for (String str1 : queue) {
			System.out.println(str1);
		}

		// deleting item from queue
		queue.remove();
		System.out.println("\nAfter removing element from Queue: ");
		for (String str1 : queue) {
			System.out.println(str1);
		}

		// adding element in queue
		queue.add("Elephent");
		System.out.println("\nAfter adding elemenet in the Queue: ");
		for (String str1 : queue) {
			System.out.println(str1);
		}
	}

}
