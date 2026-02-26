package OOPs;

class A {

	String empName = "Anbu";

	void display(int empNo) {
		System.out.println("In class A: " + empName + "\tEmp No: " + empNo);
	}

	void show() {
		System.out.println("Show Mehtod");
	}

}

class B extends A {

	float empSalary = 65532.45f;

	@Override
	void display(int empNo) {
		System.out.println(empName + "\t" + empNo);
		// super.display(10);
		System.out.println("In class B: Emp Name: " + empName + "\tEmp Salary: " + empSalary);
	}

	void present() {
		System.out.println("Present Method");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		B b1 = new B();
		b1.display(1001);

		A a1 = new B(); // upcasting
		a1.display(10);
		B b2 = new A();
		b2.show();
		b2.present();
		
	}
}
