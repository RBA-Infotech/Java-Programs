package Mulithreading;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicCounter {
	private AtomicInteger count = new AtomicInteger();

	public void increment() {
		count.incrementAndGet();
	}

	public int getCount() {
		return count.get();
	}
}

public class AtomicOperation {
	public static void main(String[] args) {

		AtomicCounter counter = new AtomicCounter();

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

		System.out.println("Final count: " + counter.getCount());
	}

}
