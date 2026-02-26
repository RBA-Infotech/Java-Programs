package OOPs;

class Employee{

	int empNo=1234;
		
	int display() {
		return empNo;
	}
	
	void display(String ename) {
		System.out.println("Employee Name: " + ename);
	}
	
	void display(int x) {
		System.out.println("int: " + x);
	}
	
	void display(int x, int y) {
		System.out.println("int: " + x + "\t int: " + y);
	}

	void display(int a, float b) {
		System.out.println("Int: "+ a + "\t Float: " +b );
	}
	
	void display(float a, int b) {
		System.out.println("Float: " + a + "\t Int: " + b);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*****
		 *  Method Overloading
		 *  
		 *  Having Same method name with many actions
		 *  1. No of parameters / arguments
		 *  2. Type of parameters /arguments
		 *  3. Order of parameters /arguments
		 */
		
		Employee e1 = new Employee();
		//Employee employee = new Employee(567);
		
		//int x = e1.display();
		System.out.println(e1.display());  // 
		
		e1.display("Selenium Training");
		
		e1.display(23); // 2. type of arguments 
		
		e1.display(45, 67); // 1. no of arguments
		
		e1.display(10, 3.14f);  // 3. order of arguments
		
		e1.display(12.34f, 20); 
	}

	// no of arguments, type of argumments and order of arguments
}
