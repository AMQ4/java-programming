package exercises;

import java.util.ArrayList;

public class FactorPrinter {
    /**
     * Prints the factors of a given positive integer in ascending order.
     * If the provided number is less than 1, it prints "Invalid Value".
     *
     * @param number The positive integer for which factors need to be printed.
     */
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value"); // Print error message for invalid input
            return;
        }
        ArrayList<Integer> factors = getFactors(number);
        factors.sort(null); // Sort the factors in ascending order

        for (Integer factor : factors) {
            System.out.println(factor); // Print each factor
        }
    }

    /**
     * Returns a list of factors of a given positive integer.
     *
     * @param number The positive integer for which factors need to be calculated.
     * @return An ArrayList containing all the factors of the provided integer.
     */
    public static ArrayList<Integer> getFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<Integer>();

        int sqrtOfNumber = (int) Math.sqrt(number);
        for (Integer i = 1; i <= sqrtOfNumber; i++) {
            if (number % i == 0) {
                factors.add(i); // Add the factor to the list
                if (number / i != i) {
                    factors.add(number / i); // Add the corresponding factor (if not the same)
                }
            }
        }
        return factors; // Return the list of factors
    }
}
