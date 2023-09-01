package exercises;

public class LargestPrime {
    /**
     * Finds and returns the largest prime factor of a given positive integer.
     *
     * @param number The positive integer for which the largest prime factor needs to be found.
     * @return The largest prime factor of the provided integer.
     *         Returns -1 if the input number is less than 1.
     */
    public static int getLargestPrime(int number) {
        if (number < 1) {
            return -1; // Return -1 for invalid input values
        }
        int largestPrime = number % 2 == 0 ? 2 : -1;

        while (number % 2 == 0 && number > 0) {
            number /= 2; // Divide the number by 2 until it's odd
        }
        int sqrtOfNumber = (int) Math.sqrt(number);

        for (int i = 3; i <= number; i += 2) {
            if (number % i == 0) {
                largestPrime = i; // Update the largestPrime when a divisor is found
                while (number % i == 0 && number > 0) {
                    number /= i; // Divide the number by the divisor until it's not divisible
                }
            }
        }
        return largestPrime; // Return the largest prime factor
    }
}
