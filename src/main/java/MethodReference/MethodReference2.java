package MethodReference;


import java.util.Arrays;

public class MethodReference2 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Dave"};
        
        // Using a static method reference for sorting
        Arrays.sort(names, String::compareToIgnoreCase);
        
        
        // Print sorted array
        Arrays.stream(names).forEach(System.out::println);
    }
}

