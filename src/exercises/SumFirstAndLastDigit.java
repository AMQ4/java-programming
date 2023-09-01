package exercises;

public class SumFirstAndLastDigit {
    /**
     * Sums the first and last digits of a given positive integer.
     *
     * @param number The positive integer for which to sum the first and last digits.
     * @return The sum of the first and last digits of the provided integer.
     *         Returns -1 if the input number is negative.
     */
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative input
        }
        int len = 1;

        // Find the length of the number by increasing len until the division results in 0
        for (; number / len != 0; ) {
            len *= 10;
        }

        len /= 10; // Divide len by 10 to get the correct scaling factor

        return number / len + number % 10; // Sum of first and last digits
    }
}
