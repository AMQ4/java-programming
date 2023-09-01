package exercises;

public class NumberToWords {
    /**
     * Converts a given positive integer to its word representation for each digit.
     * Prints the word representation of each digit from left to right.
     *
     * @param number The positive integer to convert to words.
     */
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value"); // Print error message for negative input
            return;
        }
        int digitCount = getDigitCount(number); // Get the count of digits in the number
        int reversedNumber = reverse(number); // Reverse the number to process digits from right to left

        while (reversedNumber != 0) {
            // Use a switch to print the word representation for each digit
            switch (reversedNumber % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversedNumber /= 10; // Remove the last digit from the reversed number
            --digitCount; // Decrement the digit count
        }

        // Print "Zero" for any remaining digits that were not processed
        while (digitCount != 0) {
            System.out.println("Zero");
            --digitCount;
        }
    }

    /**
     * Counts the number of digits in a given positive integer.
     *
     * @param number The positive integer for which to count the digits.
     * @return The count of digits in the provided integer.
     *         Returns -1 for negative input.
     */
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative input
        }
        int count = 0;
        while (number != 0) {
            ++count; // Increment the count for each digit
            number /= 10; // Remove the last digit from the number
        }

        return count == 0 ? 1 : count; // Return 1 if the number is 0, otherwise return the digit count
    }

    /**
     * Reverses the digits of a given positive integer.
     *
     * @param number The positive integer to reverse.
     * @return The reversed integer.
     */
    public static int reverse(int number) {
        int r = 0;
        while (true) {
            r += number % 10; // Add the last digit of number to the reversed integer
            number /= 10; // Remove the last digit from number
            if (number != 0) {
                r *= 10; // Multiply the reversed integer by 10 to accommodate the next digit
            } else {
                break; // Exit the loop when all digits have been processed
            }
        }
        return r; // Return the reversed integer
    }
}
