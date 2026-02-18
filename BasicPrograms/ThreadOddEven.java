package Mulithreading;

/*
 * Problem Statement 1: Create a Java program that uses multithreading to print even and odd
numbers alternately. The program should consist of two threads, one responsible for printing
even numbers, and the other for odd numbers. The program should print numbers from 1 to a
specified limit, and the two threads should synchronize to ensure the numbers are printed in the
correct sequence.
 * 
 */

public class ThreadOddEven {
    private static final int LIMIT = 20;
    private static final Object lock = new Object();
    private static volatile int count = 1;

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> printEven());
        Thread oddThread = new Thread(() -> printOdd());

        evenThread.start();
        oddThread.start();
    }

    private static void printEven() {
        while (count <= LIMIT) {
            synchronized (lock) {
                if (count % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + count);
                    count++;
                    lock.notify(); // Notify the other thread to start
                } else {
                    try {
                        lock.wait(); // Wait for the other thread to notify
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static void printOdd() {
        while (count <= LIMIT) {
            synchronized (lock) {
                if (count % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + count);
                    count++;
                    lock.notify(); // Notify the other thread to start
                } else {
                    try {
                        lock.wait(); // Wait for the other thread to notify
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
