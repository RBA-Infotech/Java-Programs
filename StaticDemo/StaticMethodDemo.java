package StaticDemo;

class Student{
	
	static int rollNo = 100;
	
	static void showRollNo() {
		System.out.println("Roll No is: " + rollNo);
	}
}

public class StaticMethodDemo {  

	public static void main(String[] a) {
		// TODO Auto-generated method stub

		Student.showRollNo();
		
		System.out.println(Student.rollNo);
	
	}

}
