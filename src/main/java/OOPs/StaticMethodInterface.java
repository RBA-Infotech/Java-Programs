package OOPs;

interface doable {

	default void firstMethod() {
		System.out.println("Default Method");
	}

	static void display() {
		System.out.println("static method from Interface");
	}
}

class Stud implements doable {

	static void display() {
		System.out.println("static method in super class");
		
	}

}


class StudChild extends Stud{

	@Override
	static void display() {
		System.out.println("static method in child class");
	}
}

public class StaticMethodInterface {

	public static void main(String[] args) {

		doable d = new Stud();
		d.firstMethod();
		doable.display();
		
		new Stud().display();
		
		new StudChild().display();
		
	}

}
