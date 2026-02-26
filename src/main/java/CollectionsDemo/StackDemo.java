package CollectionsDemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		for (Integer integer : stack) {
			System.out.println(integer);
		}
		
		// access last element
		System.out.println("Accessing Last Element: " + stack.peek());
		
		//remove the top element
		stack.pop();
		
		for (Integer integer : stack) {
			System.out.println(integer);
		}
		
	}

}
