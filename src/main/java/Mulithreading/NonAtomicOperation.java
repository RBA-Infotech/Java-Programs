package Mulithreading;

class Counter1 {
	private int count = 0;

	public void increment() {
		System.out.println(Thread.currentThread().getName() + "\t" + count++);
	}

	public int getCount() {
		return count;
	}
}

public class NonAtomicOperation {
	public static void main(String[] args) {
		Counter1 counter = new Counter1();

		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				counter.increment();
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
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
