package OOPs;


class A2{
	int empNo = 1234;
	
	void display() {
		System.out.println("in class A: " + empNo);
	}
}

class B2 extends A2{   // code reusability
	String empName="Arun";
	
	void displayB2() {
		System.out.println("in class b: "+ empName);
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B2 b = new B2();
		System.out.println(b.empNo + "\t" + b.empName);

		b.display();
		b.displayB2();
	}

}
