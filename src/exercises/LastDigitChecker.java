package exercises;

public class LastDigitChecker {
    /**
     * Checks if three given integers have at least two of them sharing the same last digit.
     *
     * @param num1 The first integer to check.
     * @param num2 The second integer to check.
     * @param num3 The third integer to check.
     * @return True if at least two of the integers share the same last digit, false otherwise.
     */
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false; // Return false if any input is not within the valid range
        }

        int lastDigitInNum1 = num1 % 10,
                lastDigitInNum2 = num2 % 10,
                lastDigitInNum3 = num3 % 10;

        return lastDigitInNum3 == lastDigitInNum2 || lastDigitInNum3 == lastDigitInNum1 || lastDigitInNum2 == lastDigitInNum1;
    }

    /**
     * Checks if the given integer is valid (between 10 and 1000, inclusive).
     *
     * @param num The integer to check for validity.
     * @return True if the integer is valid, false otherwise.
     */
    public static boolean isValid(int num) {
        return (num >= 10 && num <= 1000); // Return true if the integer is within the valid range
    }
}
