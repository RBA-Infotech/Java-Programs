package OOPs;

class Student{
	int empNo = 1234;
	String empName="Arun";
	
	public Student(){
		System.out.println("parent class constructor");
	}
	
	void displayStudent() {
		System.out.println("In Super Class: " + empNo + "\t" + empName);
	}
}

class Grade extends Student{   // code reusability
	float avgMark = 87.32f;
	
	public Grade() {
		System.out.println("child class constructor");
	}
	
	void displayGrade() {
		System.out.println(empNo);
		displayStudent();
		System.out.println("In Sub class: "+ empNo + "\t" + empName + "\t" + avgMark);
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grade grade = new Grade();
		
//		grade.displayStudent();
//		grade.displayGrade();
	}

}
