package DesignPatternCreational.WithFactoryDP;

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

//Creator Abstract Class or Interface
abstract class ShapeFactory {
	// Factory Method
	public abstract Shape createShape();

	// Other operations that use the created shape
	public void drawShape() {
		Shape shape = createShape();
		shape.draw();
	}
}

//Concrete Creators
class CircleFactory extends ShapeFactory {
	@Override
	public Shape createShape() {
		return new Circle();
	}
}

class SquareFactory extends ShapeFactory {
	@Override
	public Shape createShape() {
		return new Square();
	}
}

class RectangleFactory extends ShapeFactory {
	@Override
	public Shape createShape() {
		return new Rectangle();
	}
}

//Client Code
public class FactoryMethodExample {
	public static void main(String[] args) {
		ShapeFactory circleFactory = new CircleFactory(); // upcasting
		circleFactory.drawShape(); // Output: Drawing a Circle

		ShapeFactory squareFactory = new SquareFactory();
		squareFactory.drawShape(); // Output: Drawing a Square

		ShapeFactory rectangleFactory = new RectangleFactory();
		rectangleFactory.drawShape(); // Output: Drawing a Rectangle
	}
}