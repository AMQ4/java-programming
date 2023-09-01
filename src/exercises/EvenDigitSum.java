package exercises;

public class EvenDigitSum {
    /**
     * Calculates the sum of even digits in a given integer.
     *
     * @param number The integer for which even digit sum needs to be calculated.
     * @return The sum of even digits in the provided integer.
     *         Returns -1 if the input number is negative.
     */
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative input
        }
        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            if (lastDigit % 2 == 0) {
                sum += lastDigit; // Add even digits to the sum
            }

            number /= 10; // Remove the last digit from the number
        }
        return sum; // Return the calculated sum of even digits
    }
}
