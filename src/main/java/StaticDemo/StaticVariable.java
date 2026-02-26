package StaticDemo;

class Staff {

	static int empNo = 1000; //
	
	void displayEmpNo() {
		System.out.println("Emp No: " + empNo);
		empNo++;
	}
}

public class StaticVariable {

	public static void main(String[] args) {
		//System.out.println("without object: " + Staff.empNo);
	
		Staff s1 = new Staff();  
		s1.displayEmpNo();   
		
		Staff s2 = new Staff(); 
		s2.displayEmpNo();  
		
		Staff s3 = new Staff(); 
		s3.displayEmpNo();

	}

}
