package OOPs;

class SampleInfo implements Employeeable, Presentable {

	public void showEmpDetails(){
		//empNo = 200;
		System.out.println("The emp name: " + empName);
	}

	public void showPresent() {
		System.out.println("Another method from another Interface");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Employeeable employee = new EmployeeInfo1();
		SampleInfo employee = new SampleInfo();
		employee.showEmpDetails();	
		employee.showPresent();
		
		
		Employeeable e1 = new SampleInfo(); 
		e1.showEmpDetails();
		
		Presentable p1 = new SampleInfo(); 
		p1.showPresent();
		
		
		
	}

}
