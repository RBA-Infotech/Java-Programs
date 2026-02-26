package Java8Features;

import java.util.Arrays;
import java.util.List;

public class StaticMethodReference {
    public static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(StaticMethodReference::print); // Method reference
    }
}
	

