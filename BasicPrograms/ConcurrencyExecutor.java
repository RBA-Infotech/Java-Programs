package Mulithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyExecutor {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3); // Thread pool with 3 threads
	
		for (int i = 1; i <= 5; i++) {
			int taskId = i;
			executor.submit(() -> {
				System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
			});
		}

		executor.shutdown(); // Shutdown the executor
	}
}
