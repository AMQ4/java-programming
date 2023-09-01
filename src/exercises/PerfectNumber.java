package exercises;

import java.util.ArrayList;

public class PerfectNumber {
    /**
     * Checks if a given positive integer is a perfect number.
     *
     * @param number The positive integer to check for perfection.
     * @return True if the provided integer is a perfect number, false otherwise.
     */
    public static boolean isPerfectNumber(int number) {
        ArrayList<Integer> factors = FactorPrinter.getFactors(number); // Get the factors of the number

        int sum = 0;
        for (Integer factor : factors) {
            sum += factor; // Calculate the sum of factors
        }

        return (sum - number) == number; // Check if the sum of factors (excluding the number itself) equals the number
    }
}
