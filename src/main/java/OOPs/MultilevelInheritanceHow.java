package OOPs;

class ClassA{
	void display() {
		System.out.println("In class A");
	}
}

class ClassB extends ClassA{
	void display() {
		System.out.println("In class B");
	}
}

class ClassC extends ClassB{
	
}
public class MultilevelInheritanceHow{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassC c = new ClassC();
		c.display();
		
	}

}
