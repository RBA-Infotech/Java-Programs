package StaticDemo;

class Staff {

	static int empNo = 1000; // 2345

	void displayEmpNo() {
		System.out.println("Emp No: " + empNo);
		empNo++;
	}
}

public class StaticVariable {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// System.out.println("without object: " + Staff.empNo);
		Staff s1 = new Staff(); // memory = 2000  
		s1.displayEmpNo();   // s1.empNo = 1000  --> 1001
		// s1.displayEmpNo(); //
		Staff s2 = new Staff(); // memory = 3000
		s2.displayEmpNo();  // s2.empNo = 1000 --> 1001
		Staff s3 = new Staff(); // memory = 4000
		s3.displayEmpNo();

	}

}
