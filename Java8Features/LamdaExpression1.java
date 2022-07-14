package Java8Features;

@FunctionalInterface
interface printInterface{	
	void display(int i);
	// non-abstract method
	default void show() {
		System.out.println("this is default method in interface");
	}
	
	default void show1() {
		System.out.println("this is default method 2 in interface");
	}
	
	}

//class Employee1 implements printInterface{
//	public void display(int i) {
//		System.out.println("printing via class method implementation = " + i);
//	}
//}


public class LamdaExpression1 {

	public static void main(String[] args) {
	
//		printInterface p;
		  
		printInterface p = new printInterface() {
			public void display(int i) {
			System.out.println("printing via interface definition = " + i);	
			}
		};
				
		p = i -> System.out.println("printing via lambda expression = " + i);
	
		
		p.display(15);
		p.show();
		p.show1();
	}

}
