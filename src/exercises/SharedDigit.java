package exercises;

/**
 * The SharedDigit class checks if two given two-digit numbers share at least one digit.
 */
public class SharedDigit {

    /**
     * Checks if two two-digit numbers, in range(10, 99) inclusive, share at least one digit.
     *
     * @param a The first two-digit number.
     * @param b The second two-digit number.
     * @return True if the numbers share at least one digit, false otherwise.
     */
    public static boolean hasSharedDigit(int a, int b) {
        // Check if a or b is not a two-digit number
        if (a > 99 || a < 10 || b < 10 || b > 99) {
            return false; // If either number is not within the valid range, return false
        }

        // Extract individual digits from a and b
        int firstDigitInA = a % 10, lastDigitInA = a / 10;
        int firstDigitInB = b % 10, lastDigitInB = b / 10;

        // Check if any of the digits in a and b match
        return firstDigitInB == firstDigitInA || firstDigitInB == lastDigitInA ||
                lastDigitInB == firstDigitInA || lastDigitInB == lastDigitInA;
    }
}
