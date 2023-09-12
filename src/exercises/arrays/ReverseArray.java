/**
 * The ReverseArray class provides a static method to reverse the order of elements in an integer array.
 * It allows you to quickly reverse the sequence of elements within the array and prints both the original
 * and reversed arrays to the console for reference.
 */
package exercises.arrays;

import java.util.Arrays;

public class ReverseArray {

    /**
     * Reverses the order of elements in the given integer array in place and prints both the original
     * and reversed arrays to the console.
     *
     * @param arr The integer array to be reversed.
     */
    private static void reverse(int[] arr) {
        System.out.println("Array = " + Arrays.toString(arr));
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(arr));
    }
}
