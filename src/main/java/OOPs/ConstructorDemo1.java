package OOPs;

class StudentDetails{
	
	int rollNo;
	String studentName;
	char studentGrade;
	
	StudentDetails(){   // 
		rollNo = 1000;
		studentName = "Anbu";
		studentGrade = 'A'; 
		System.out.println(rollNo + "\t" + studentName + "\t" + studentGrade);
	}
	
	StudentDetails(int r, String name){   // 
		rollNo = r;
		studentName = name;
		System.out.println(rollNo + "\t" + studentName);
	}
	
	void displayStudentDetails() {
		System.out.println("Roll No: " + rollNo + "\t Name: " + studentName + "Grade: " + studentGrade);
	}
}


public class ConstructorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDetails s1 = new StudentDetails();
		StudentDetails s2 = new StudentDetails(200, "Greate Dharani");
		
		s1.displayStudentDetails();
	}

}
