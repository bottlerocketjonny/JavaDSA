package javaDSA.examples;

// begin at index 1 - store in temp variable
// example element(s) to left. if larger, then shift element(s) to the right
// replace gap with element stored in temp
// O(n^2) quadratic time
// preferable to bubble and selection sort!

public class InsertionSort {

    public static void main(String[] args) {

        int[] array = {9, 4, 3, 2, 5, 7, 6, 8, 1};

        insertionSort(array);

        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];                        // array[i] stored in temp (start on 1st index)
            int j = i - 1;                              // keep track of value to left of i

            while (j >= 0 && array[j] > temp) {         // continue comparing values to left of i
                array[j + 1] = array[j];                // shift element to the right
                j--;                                    // decrement j
            }
            array[j + 1] = temp;                        // temp placed in the gap
        }

    }
}
