package OOPs;

class EmployeeDet{
	
private int empNo = 123;
	
 void displayEmpNo() {
		System.out.println("Emp No: "+ empNo);
	}
}


public class PrivateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDet displayMessage = new EmployeeDet();
		
		System.out.println("The value is: " + displayMessage.empNo);
		displayMessage.displayEmpNo();
		
	}

}
