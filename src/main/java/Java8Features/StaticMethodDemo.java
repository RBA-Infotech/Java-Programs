3package Java8Features;

/************************************
 * the purpose of static method interface is to define utility or helper method
 * 
 **********************************/

interface MathOperations {
    static int add(int a, int b) {
        return a + b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {
        System.out.println(MathOperations.add(5, 10));       // Output: 15
        System.out.println(MathOperations.multiply(5, 10)); // Output: 50
    }
}
