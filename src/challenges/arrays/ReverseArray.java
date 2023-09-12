/**
 * The ReverseArray class provides a static method to reverse the order of elements in a double array.
 * It allows you to quickly reverse the sequence of elements within the array.
 */
package challenges.arrays;

public class ReverseArray {

    /**
     * Reverses the order of elements in the given double array in place.
     * The first element becomes the last, the second becomes the second-to-last, and so on.
     *
     * @param arr The double array to be reversed.
     */
    public static void reverse(double[] arr) {
        double temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
