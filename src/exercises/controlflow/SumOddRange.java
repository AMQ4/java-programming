package exercises.controlflow;

public class SumOddRange {
    /**
     * Checks if a given integer is odd and positive.
     *
     * @param number The integer to check for oddness and positivity.
     * @return True if the number is odd and positive, false otherwise.
     */
    public static boolean isOdd(int number) {
        return (number > 0 && number % 2 == 1) ? true : false;
    }

    /**
     * Calculates the sum of odd integers within a specified range.
     *
     * @param start The starting integer of the range.
     * @param end   The ending integer of the range.
     * @return The sum of odd integers within the specified range.
     *         Returns -1 if start is greater than end or if either is non-positive.
     */
    public static int sumOdd(int start, int end) {
        if (start > end || start <= 0 || end <= 0) {
            return -1; // Return -1 for invalid input values
        }
        int sum = 0;

        // Iterate through the range and add odd numbers to the sum
        for (int i = start; i <= end; ++i) {
            sum += (isOdd(i) ? i : 0); // Add odd numbers, ignore even numbers
        }
        return sum; // Return the sum of odd numbers
    }
}
