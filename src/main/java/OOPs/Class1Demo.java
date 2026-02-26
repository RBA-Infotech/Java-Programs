package OOPs;

public class Class1Demo {

	int empNo = 123;
	
	void displayEmpNo() {
		System.out.println("Emp No: "+ empNo);
	}
	
	int getEmpNo() {
		return empNo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class1Demo simpleClass = new Class1Demo();
		
		System.out.println(simpleClass.empNo);
		simpleClass.displayEmpNo(); 
		System.out.println(simpleClass.getEmpNo());
	}

}
