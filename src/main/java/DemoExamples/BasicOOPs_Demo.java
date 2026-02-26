package DemoExamples;
class Employee{
	String emp_name="Selenium";
	
	 void display() { //method definition	
		System.out.println("Inside method " + emp_name);
	}
}

public class BasicOOPs_Demo {

	public static void main(String[] a) {
		// TODO Auto-generated method stub

			
		Employee e1 = new Employee();
		System.out.println(e1.emp_name);
		
		e1.display(); //method call	
	}
}

