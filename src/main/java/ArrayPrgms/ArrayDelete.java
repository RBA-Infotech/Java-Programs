package ArrayPrgms;

import java.util.Scanner;

public class ArrayDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example array
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        // Print original array
        System.out.print("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Input element to delete
        System.out.print("\nEnter element to delete: ");
        int element = sc.nextInt();

        // Find position of element
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Element not found!");
        } else {
            // Shift elements to left
            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--; // Reduce array size

            // Print updated array
            System.out.print("Array after deletion: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}

