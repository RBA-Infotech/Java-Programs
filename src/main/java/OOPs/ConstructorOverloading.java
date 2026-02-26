package OOPs;

class StudentInfo{
	
	int rollNo;
	String studentName;
	char studentGrade;
	
	StudentInfo(){
		rollNo = 1000;
		studentName = "Anbu";
		studentGrade = 'A'; 
	}
	
	StudentInfo(int rollNo1, String studentName1, char studentGrade1){
		rollNo = rollNo1;
		studentName = studentName1;
		studentGrade = studentGrade1; 
	}
	
	StudentInfo(char studentGrade1, int rollNo1){
		rollNo = rollNo1;
		studentGrade = studentGrade1; 
	}
	
	void displayStudentDetails() {
		System.out.println("Roll No: " + rollNo + "\t Name: " + studentName + "\tGrade: " + studentGrade);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentInfo s1 = new StudentInfo();		
		StudentInfo s2 = new StudentInfo(2000, "Senthil", 'D');
		StudentInfo s3 = new StudentInfo('B',3000);
		
		s1.displayStudentDetails();
		s2.displayStudentDetails();
		s3.displayStudentDetails();
	}

}
