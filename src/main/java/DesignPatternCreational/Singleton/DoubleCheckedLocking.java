package DesignPatternCreational.Singleton;

class DCLSingleton {
	private static volatile DCLSingleton instance;

	private DCLSingleton() {
	}

	public static DCLSingleton getInstance() {
		if (instance == null) {
			synchronized (DCLSingleton.class) {
				if (instance == null) {
					instance = new DCLSingleton();
				}
			}
		}
		return instance;
	}
}

public class DoubleCheckedLocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create two threads that call the Singleton's getInstance method
		Thread thread1 = new Thread(() -> {
			DCLSingleton instance1 = DCLSingleton.getInstance();
			System.out.println("Instance from Thread 1: " + instance1);
		});

		Thread thread2 = new Thread(() -> {
			DCLSingleton instance2 = DCLSingleton.getInstance();
			System.out.println("Instance from Thread 2: " + instance2);
		});

		// Start both threads
		thread1.start();
		thread2.start();
	}
}
