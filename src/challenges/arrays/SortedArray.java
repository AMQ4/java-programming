/**
 * The SortedArray class provides methods for generating random integer arrays
 * and sorting them in decreasing order.
 */
package challenges.arrays;

import java.util.Arrays;
import java.util.Random;

public class SortedArray {
    /**
     * Generates a random integer array of the specified length.
     *
     * @param len The length of the array to generate.
     * @return An array of random integers.
     */
    public static int[] randomIntArrayGenerator(int len) {
        Random random = new Random();
        int[] arr = new int[len];

        for (int i = 0; i < len; ++i) {
            arr[i] = random.nextInt(0, 1000);
        }
        return arr;
    }

    /**
     * Sorts an integer array in decreasing order using the insertion sort algorithm.
     *
     * @param arr The array to be sorted in decreasing order.
     */
    public static void sortingInDecreasingOrder(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int j = i;
            while (j - 1 > -1 && arr[j] > arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                --j;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = randomIntArrayGenerator(10);
        SortedArray.sortingInDecreasingOrder(arr);
        System.out.println(Arrays.toString(arr));
    }
}
