package OOPs;

class Employee{
	
	int empNo;
	float salary;
	
	Employee(){   //default contructor
		empNo=123;	
	}
	
	Employee(int eno, float sal){
		empNo = eno;
		salary = sal;
	}
	
	Employee(float sal, int eno){
		empNo = eno;
		salary = sal;
	}
	
	void displayMsg() {
		System.out.println(empNo);
		System.out.println(salary);
	}
}

public class SimpleContructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		
		Employee e2 = new Employee(123, 3.14f);
		
		Employee e3 = new Employee(3.14f, 345);
		
		e1.displayMsg();
		e2.displayMsg();
		e3.displayMsg();
		
	}

}
