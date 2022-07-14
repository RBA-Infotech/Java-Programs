package OOPs;

class A{
	
	String empName = "Selenium";
	
	void display() {
		System.out.println("In class A: " + empName);
	}
	
	
}

class B extends A{
	
	String empName = "Selenium Traiing";
		
	void display() {
		super.display();  //super.empName
		System.out.println("In class B: " + empName);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b1 = new B();
		b1.display();
		
		}
}
