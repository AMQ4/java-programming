package exercises.controlflow;

public class GreatestCommonDivisor {
    /**
     * Calculates the greatest common divisor (GCD) of two positive integers.
     *
     * @param num1 The first positive integer.
     * @param num2 The second positive integer.
     * @return The greatest common divisor of the two provided integers.
     *         Returns -1 if either of the input integers is less than 10.
     */
    public static int getGreatestCommonDivisor(int num1, int num2) {
        if (num1 < 10 || num2 < 10) {
            return -1; // Return -1 for input values less than 10
        }

        while (num1 % num2 != 0) {
            int mod = num1 % num2;
            num1 = num2;
            num2 = mod; // Update num2 with the remainder
        }
        return num2; // Return the greatest common divisor
    }
}
