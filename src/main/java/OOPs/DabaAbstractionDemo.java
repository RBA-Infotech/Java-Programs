package OOPs;

class EmployeeDetails{
	
	private int empNo = 123;
	String empName = "Naveena";
	
	private void displayDetails() {  //method definition
		System.out.println("Emp No: " + empNo +"\t" + "Emp Name: " + empName);
	}
}

public class DabaAbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDetails e1 = new EmployeeDetails();
		
		System.out.println("Accessing variable directly");
		System.out.println(e1.empNo);
		
		System.out.println("Accessting via Method");
		e1.displayDetails();
	}

}
