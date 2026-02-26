package BasicPrograms;

import java.util.Scanner;

public class TimeComplexity {

    // Function for which time and space complexity is calculated
    public static void exampleFunction(int n) {
        int sum = 0; // O(1) space complexity

        // O(n) time complexity loop
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        long startTime = System.nanoTime(); // Start time

        exampleFunction(n); // Call the function

        long endTime = System.nanoTime(); // End time
        long timeTaken = endTime - startTime; // 1e9; // Time taken in seconds

        System.out.println("Time taken by the function: " + timeTaken + " nano seconds");

        scanner.close();
    }
}

