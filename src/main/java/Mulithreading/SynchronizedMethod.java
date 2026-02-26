package Mulithreading;

class Counter {
	private int count = 0;

	public synchronized void increment() { // Synchronized method
		System.out.println(Thread.currentThread().getName() + "\t Count: " + ++count);
	}

	public int getCount() {
		return count;
	}
}

public class SynchronizedMethod {
	public static void main(String[] args) {
		Counter counter = new Counter();

		Thread thread1 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				counter.increment();
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				counter.increment();
			}
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final count: " + counter.getCount());
	}

}
