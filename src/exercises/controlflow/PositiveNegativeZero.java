package exercises.controlflow;

public class PositiveNegativeZero {
    public static void checkNumber(int n) {
        if (n > 0) {
            System.out.println("positive");
        } else {
            if (n == 0) {
                System.out.println("zero");
            } else {
                System.out.println("negative");
            }
        }
    }
}