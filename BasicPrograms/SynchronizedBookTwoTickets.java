package Mulithreading;

class TicketBookingSystem {
	private int availableSeats = 1;

	public synchronized void bookSeat(String user) {
		if (availableSeats > 0) {
			System.out.println(user + " is booking a seat...");
			availableSeats--;
			System.out.println(user + " successfully booked a seat. Remaining seats: " + availableSeats);
		} else {
			System.out.println(user + " tried to book a seat, but no seats are available.");
		}
	}
}

public class SynchronizedBookTwoTickets {
	public static void main(String[] args) {
		TicketBookingSystem system = new TicketBookingSystem();

		Thread userA = new Thread(() -> system.bookSeat("User A"));
		Thread userB = new Thread(() -> system.bookSeat("User B"));

		userA.start();
		userB.start();
	}
}
