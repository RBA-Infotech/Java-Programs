package DesignPatternCreational.Singleton;

class Singleton {
	private static Singleton instance;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	String displayThreadSafe() {
		return "Lazy Singleton with Thread Safe";
	}
}

public class ThreadSafeSingleton {

	public static void main(String[] args) {

		// Create two threads that call the Singleton's getInstance method
		Thread thread1 = new Thread(() -> {
			Singleton instance1 = Singleton.getInstance();
			System.out.println("Instance from Thread 1: " + instance1);
		});

		Thread thread2 = new Thread(() -> {
			Singleton instance2 = Singleton.getInstance();
			System.out.println("Instance from Thread 2: " + instance2);
		});

		// Start both threads
		thread1.start();
		thread2.start();
	}
}
