package OOPs;

public class SimpleClass1 {

	int empNo = 123;
	
	void displayEmpNo() {
		System.out.println("Emp No: "+ empNo);
	}
	
	int getEmpNo() {
		return empNo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleClass1 simpleClass = new SimpleClass1();
		
		System.out.println("The Emp No is: " + simpleClass.empNo);
		simpleClass.displayEmpNo();
		
		int empNo = simpleClass.getEmpNo();
		
		System.out.println("Emp No: " + empNO);
		
	}

}
