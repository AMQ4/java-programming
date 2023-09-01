package exercises;

public class NumberPalindrome {
    /**
     * Checks if a given integer is a palindrome.
     *
     * @param number The integer to check for palindrome property.
     * @return True if the provided integer is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(int number) {
        int n = number, r = 0; // Initialize variables to reverse the number

        while (true) {
            r += n % 10; // Add the last digit of n to the reversed number
            n /= 10; // Remove the last digit from n
            if (n != 0) {
                r *= 10; // Multiply the reversed number by 10 to accommodate next digit
            } else {
                break; // Exit the loop when all digits have been processed
            }
        }
        return r == number; // Compare the reversed number with the original number
    }
}
