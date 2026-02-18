package Mulithreading;

class BankAccount {
	private int balance = 1000;

	public void withdraw(String user, int amount) {
		System.out.println(user + " is attempting to withdraw $" + amount);

		synchronized (this) { // Synchronized block
			if (balance >= amount) {
				System.out.println(user + " is withdrawing $" + amount);
				balance -= amount;
				System.out.println(user + " successfully withdrew $" + amount + ". Remaining balance: $" + balance);
			} else {
				System.out.println(user + " tried to withdraw $" + amount
						+ " but insufficient balance. Remaining balance: $" + balance);
			}
		}

	}
}

public class SynchronizedBlock {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		Thread userA = new Thread(() -> account.withdraw("User A", 700));
		Thread userB = new Thread(() -> account.withdraw("User B", 500));

		userA.start();
		userB.start();
	}
}
