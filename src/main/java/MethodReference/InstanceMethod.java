package MethodReference;

import java.util.function.Consumer;

public class InstanceMethod {

	public void display(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {

		InstanceMethod im = new InstanceMethod();
		
		Consumer<String> displayMsg = im::display;
		
		displayMsg.accept("Selenium Training for Wipro Employees");
	}

}
