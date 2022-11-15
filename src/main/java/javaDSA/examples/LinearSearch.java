package javaDSA.examples;

// iterate over collection one element at a time. O(n) linear
// slow for large data sets
// fast for small/medium data sets
// don't need to be sorted
// useful for DS that don't have random access (linked lists)

public class LinearSearch {

    public static void main(String[] args) {

        int[] array = {0, 3, 5, 6, 4, 6, 3, 5};

        int index = linearSearch(array, 5);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found!");
        }
    }

    private static int linearSearch(int[] array, int value) {
        // if index at i is == to value. return i
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
