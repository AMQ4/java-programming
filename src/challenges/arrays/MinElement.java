/**
 * The MinElement class provides methods for working with arrays of double values.
 * It includes methods to read an array of double values from user input and find the minimum value in the array.
 */
package challenges.arrays;

import java.util.Scanner;

public class MinElement {

    /**
     * Reads a list of comma-delimited double values from the user's input and returns them as an array of double.
     *
     * @return An array of double values entered by the user.
     */
    public static double[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        String commaDelimitedNumbers = scanner.nextLine(); // assuming correct input.

        String[] splitNumbers = commaDelimitedNumbers.split(",");
        double[] numbers = new double[splitNumbers.length];

        for (int i = 0; i < splitNumbers.length; i++) {
            numbers[i] = Double.parseDouble(splitNumbers[i]);
        }
        return numbers;
    }

    /**
     * Finds and returns the minimum value from the given array of double values.
     *
     * @param numbers An array of double values.
     * @return The minimum value found in the array.
     */
    public static double findMin(double[] numbers) {
        double min = Double.MAX_VALUE;
        for (double number : numbers) {
            min = Math.min(number, min);
        }
        return min;
    }
}
