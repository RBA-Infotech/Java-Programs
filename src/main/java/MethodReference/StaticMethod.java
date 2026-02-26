package MethodReference;

import java.util.function.Consumer;

class StaticClass{
	
	public static void display(String msg) {
		System.out.println(msg);
	}
}

public class StaticMethod {

	public static void main(String[] args) {

		//StaticClass.display();
		
		Consumer<String> printMsg = StaticClass::display;
		
		printMsg.accept("SDET Training");
		
	}

}
