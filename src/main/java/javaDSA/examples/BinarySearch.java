package javaDSA.examples;

// search algo that finds position of value within a SORTED array
// half of array eliminated after each step
// always begin the middle. if not equal, check if middle index is greater than or less than target value
// and repeat... until one element is left
// not efficient with small datasets, but excellent for large datasets

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = new int[1000000];
        int target = 77778;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        // built in java util binary search
        // int index = Arrays.binarySearch(array, target);

        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println(target + " not found");
        } else {
            System.out.println("Element found at: " + index);
        }

    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("middle: " + middle);

            if (value < target) low = middle + 1;
            else if (value > target) high = middle - 1;
            else return middle; // target is found
        }
        return -1; // target not found
    }


}
