package DesignPatternCreational.Singleton;

class LazySingleton {
	private static LazySingleton instance;

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			System.out.println("inside if loop");
			instance = new LazySingleton();
		}
		return instance;
	}

	public void display() {
		System.out.println("Lazy Singleton object is created");
	}
}

public class LazySingletonDemo {

	public static void main(String[] args) {

		// LazySingleton ls = new LazySingleton();

		LazySingleton ls = LazySingleton.getInstance();
		ls.display();
		
		LazySingleton ls2 = LazySingleton.getInstance();
		ls2.display();
	}
}