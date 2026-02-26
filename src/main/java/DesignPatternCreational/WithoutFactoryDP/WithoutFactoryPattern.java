package DesignPatternCreational.WithoutFactoryDP;

//Product Interface
interface Shape {
	void draw();
}

//Concrete Products
class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}

class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Square");
	}
}

class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}

//Client Code WITHOUT Factory Pattern
public class WithoutFactoryPattern {
	public static void main(String[] args) {
		// Problem 1: Tight Coupling
		Shape circle = new Circle();
		circle.draw();

		Shape square = new Square();
		square.draw();

		Shape rectangle = new Rectangle();
		rectangle.draw();

		// Problem 2: What if we need to create shapes based on user input?
		String shapeType = "Square"; // Simulate user input

		Shape shape = null;
		if (shapeType.equals("Circle")) {
			shape = new Circle();
		} else if (shapeType.equals("Square")) {
			shape = new Square();
		} else if (shapeType.equals("Rectangle")) {
			shape = new Rectangle();
		} else {
			System.out.println("Invalid shape type");
		}

		if (shape != null) {
			shape.draw();
		}

		// Problem 3: What if the creation logic becomes more complex?
		// Imagine Circle needs a radius, Square needs a side, etc.
		// This logic would clutter the client code.
	}
}
