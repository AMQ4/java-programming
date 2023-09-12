/**
 * The MinimumElement class provides methods for working with arrays of integer values.
 * It includes methods to read an array of integers from user input, read a single integer,
 * and find the minimum value in the array.
 */
package exercises.arrays;

import java.util.Scanner;

public class MinimumElement {

    /**
     * Reads an array of integer values from user input.
     *
     * @param size The size of the array to read.
     * @return An array of integers entered by the user.
     */
    private static int[] readElements(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        return numbers;
    }

    /**
     * Reads a single integer from user input.
     *
     * @return The integer entered by the user.
     */
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    /**
     * Finds and returns the minimum value from the given array of integer values.
     *
     * @param numbers An array of integer values.
     * @return The minimum value found in the array.
     */
    private static int findMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            min = Math.min(number, min);
        }
        return min;
    }
}
