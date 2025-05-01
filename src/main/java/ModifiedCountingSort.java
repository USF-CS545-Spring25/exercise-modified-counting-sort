import java.util.Arrays;

public class ModifiedCountingSort {
    /**
     * Implementation of the modified counting sort
     * @param arr input array
     * @param maxValue largest possible value that can occur in the array.
     * Assume the range of elements is from 0 to maxValue, inclusive.
     */
    public static void sort(Elem[] arr, int maxValue) {
        int[] counterArray = new int[maxValue + 1];
        for (int i = 0; i < arr.length; i++) {
            // FILL IN CODE: access the key for arr[i] and increment the value in the corresponding "bin" in the counterArray

        }

        // Modify the counter array c[j] = c[j] + c[j-1]
        for (int j = 1; j < counterArray.length; j++) {
            // FILL IN CODE

        }

        // FILL IN CODE:
        Elem[] result = new Elem[arr.length];
        for (int k = arr.length - 1; k >= 0; k--) {
            // Iterate over the input array and using the counter array, place elements back into arr
            // Start by accessing the key for arr[k]; then look at the counterArray for the corresponding "bin"
            // You need to adjust the value in the counterArray and use that value to place arr[k] in the result array

        }

        // Copy elements from the array "result" back to arr
        // FILL IN CODE

    }

    public static void main(String[] args) {
        Elem[] records = {
                new Elem(6, "red"),
                new Elem(1, "blue"),
                new Elem(6, "yellow"),
                new Elem(2, "black"),
                new Elem(1, "brown"),
                new Elem(6, "orange"),
                new Elem(0, "green"),
                new Elem(6, "gray")};
        sort(records, 6);
        System.out.println(Arrays.toString(records));
    }

}
