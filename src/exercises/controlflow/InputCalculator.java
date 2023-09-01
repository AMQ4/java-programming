package exercises.controlflow;

import java.util.Scanner;

public class InputCalculator {
    /**
     * Reads a series of integers from the user until a non-integer input is encountered.
     * Prints the sum and average of the provided integers.
     */
    public static void inputThenPrintSumAndAverage() {
        int sum = 0, counter = 0; // Initialize variables to store sum and count
        Scanner scanner = new Scanner(System.in); // Create a scanner to read input

        while (true) {
            int number = 0;
            try {
                number = Integer.parseInt(scanner.nextLine()); // Read the input as an integer
                sum += number; // Add the input number to the sum
                ++counter; // Increment the count of numbers read
            } catch (NumberFormatException e) {
                // When non-integer input is encountered, print sum and average and exit the loop
                System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / counter));
                break;
            }
        }
    }
}
