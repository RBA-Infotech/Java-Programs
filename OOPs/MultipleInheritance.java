package OOPs;

import DemoExamples.main;

class A1{
	int empNo = 1234;
	
	void display() {
		System.out.println("in class A: " + empNo);
	}
}

class B1{
	String empName="Arun";
	
	void display() {
		System.out.println("in class b: "+ empName);
	}
}

class C extends A1, B1{
	
	
}

// ambiguity error

public class MultipleInheritance {

	public static void main(String[] a) {
		
		
	}

}
