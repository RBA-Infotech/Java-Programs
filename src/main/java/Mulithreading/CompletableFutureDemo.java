package Mulithreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

	public static void main(String[] args) {
		CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Hello";
		})
			.thenApply(s -> s + " World")
			.thenAccept(System.out::println);

		future.join(); // Wait for completion (no need for try-catch)
		System.out.println("Main thread continues");
	}
}
