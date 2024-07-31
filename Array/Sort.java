package Array;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        // Example array
        Integer[] numbers = {34, 23, 1, 67, 89, 2, 99, 12};

        // Sort array in ascending order
        Arrays.sort(numbers);
        System.out.println("Array in ascending order: " + Arrays.toString(numbers));

        // Sort array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Array in descending order: " + Arrays.toString(numbers));
    }
}