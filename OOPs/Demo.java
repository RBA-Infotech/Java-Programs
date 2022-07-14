package OOPs;

class EmpDetails {
	
	int empID = 100;
	String empName = "Raja";
	
	void displayEmp() {
		System.out.println("Emp ID: " + empID +"\t Emp Name: " + empName);
	}	
}

public class Demo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	EmpDetails e1 = new EmpDetails();
	System.out.println("Accessing data members via object");
	System.out.println("Emp ID: " + e1.empID + "\tEmp Name : " + e1.empName);
	
	System.out.println("Accessing data via member funciton");
	e1.displayEmp();
		
	}

}
