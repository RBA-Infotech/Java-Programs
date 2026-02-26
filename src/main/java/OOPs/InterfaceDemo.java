package OOPs;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//access the method via class object
		SampleInfo employee = new SampleInfo();
		employee.showEmpDetails();	
		employee.showPresent();
	
		
		
		// access the method via interface reference variable
		Employeeable e1 = new SampleInfo(); 
		e1.showEmpDetails();
	
		
		//// access the method via interface reference variable
		Presentable p1 = new SampleInfo(); 
		p1.showPresent();
	
		
		
		
	}

}
