package OOPs;

class EmpBasicInfo{   // parent or super
	
	int empNo = 123;
	protected String empName ="Anbu";
	
	void displayEmpBI() {
		System.out.println("Emp No: " + empNo + "\t Emp Name: " + empName);
	}
}

class EmpAddInfo extends EmpBasicInfo{   // child or sub-class

	//String parentVar = "sfdsf";
	String deptName = "Account";
	
	void displayEmpAddInfo() {
		System.out.println("Emp No: " + empNo + "\t Emp Name: " + empName + "\t Department: " + deptName);
	}
}


public class SimpleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// accessing the parent properties
		EmpBasicInfo p1 = new EmpBasicInfo();  //empBasciInfo
		System.out.println(p1.empNo);
		p1.displayEmpBI();
		
		// accessing the child properties
		EmpAddInfo c1 = new EmpAddInfo();
		System.out.println(c1.deptName);
		c1.displayEmpAddInfo();
		
		//accessing parent properties via child class object
		System.out.println(c1.empName + " via child object");
		c1.displayEmpBI();
		
	}
}
