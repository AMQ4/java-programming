package exercises.arrays;

/**
 * The SortedArray class provides utility methods for working with integer arrays,
 * including input, printing, and sorting.
 */
import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    /**
     * Reads integers from the console and stores them in an array.
     *
     * @param size The number of integers to read.
     * @return An array containing the entered integers.
     */
    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    /**
     * Prints the contents of an integer array to the console.
     *
     * @param arr The array to be printed.
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.printf("Element %d contents %d%n", i, arr[i]);
        }
    }

    /**
     * Creates a sorted copy of an integer array in descending order.
     *
     * @param arr1 The original array to be sorted.
     * @return A new array containing the sorted elements in descending order.
     */
    public static int[] sortIntegers(int arr1[]) {
        int[] arr = Arrays.copyOf(arr1, arr1.length);
        for (int i = 1; i < arr.length; ++i) {
            int j = i;
            while (j - 1 > -1 && arr[j] > arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                --j;
            }
        }
        return arr;
    }
}
