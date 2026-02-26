package OOPs;
import java.util.Scanner;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeInfo employeeInfo = new EmployeeInfo();  
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter emp id");
		int empID = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter emp name");
		String empName = sc.nextLine();
		
		employeeInfo.setEmpID(empID); //100
		employeeInfo.setEmpName(empName);
		
		System.out.println(employeeInfo.getEmpID());
		System.out.println(employeeInfo.getEmpName());
		
		
	}

}
