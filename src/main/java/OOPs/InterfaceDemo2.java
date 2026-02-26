package OOPs;

class SampleInfo2 implements Employeeable1, Presentable1 {

	public void showEmpDetails(){
		//empName="Senthil123";
		System.out.println("The emp name: " + empName);
	}

}

public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//access the method via class object
		SampleInfo2 employee = new SampleInfo2();
		employee.showEmpDetails();	
		
		// access the method via interface reference variable
		Employeeable1 e1 = new SampleInfo2(); 
		e1.showEmpDetails();
	
		
		//// access the method via interface reference variable
		Presentable1 p1 = new SampleInfo2(); 
		p1.showEmpDetails();
	
		
		
		
	}

}
