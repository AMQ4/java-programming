package exercises;

public class DiagonalStar {
    /**
     * Prints a square pattern with diagonal lines composed of asterisks (*) and spaces.
     * The pattern has a solid square border and diagonal lines from top-left to bottom-right
     * and top-right to bottom-left, while the inner region is filled with spaces.
     *
     * @param number The size of the square pattern. Must be equal to or greater than 5.
     */
    public static void printSquareStar(int number) {
        if (number < 5) {
            return; // Return early if the provided number is less than 5
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; ++j) {
                if (i == j || i == 0 || i == number - 1 || j == 0 || j == number - 1 || i + j == number - 1) {
                    System.out.print("*"); // Print an asterisk for border and diagonal positions
                } else {
                    System.out.print(" "); // Print a space for non-diagonal positions
                }
            }
            System.out.print("\n"); // Move to the next line after each row is printed
        }
    }
}
