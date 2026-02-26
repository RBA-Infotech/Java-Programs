package OOPs;

abstract class Shape{
	abstract void draw();
	
	void displayShape() {
		System.out.println("In parent Class display");
	}
}

class Circle extends Shape{
	
	void draw() {
		System.out.println("inside circle");
	}
	
	void displayCircle() {
		System.out.println("In child Class display");
	}
}

public class AbstractClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		Shape s = new Shape();
		
		
		Circle c1 = new Circle();
		c1.draw();
		
		s1.draw();
		s1.displayShape();
		
		s1.displayCircle();
	}

}
