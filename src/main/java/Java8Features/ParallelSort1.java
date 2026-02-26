package Java8Features;

import java.util.Arrays;

public class ParallelSort1 {

	public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        Arrays.parallelSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
