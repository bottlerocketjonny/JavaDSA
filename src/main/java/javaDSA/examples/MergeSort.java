package javaDSA.examples;

// Divide and conquer algo
// First function divides array into two and creates sub-arrays
// Recursive - continues until the array has a size of 1
// Second function called Merge - merges them into the sub-array they came from, but in order...
// ... and so on until the original array is sorted.
// uses a tree like structure with branches.
// O(n Log n) - faster than bubble sort, insertion sort, selection sort but uses more space

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {1, 4, 3, 5, 2, 7, 6, 8, 9};

        mergeSort(array);

        for (int j : array) {
            System.out.print(j + " ");
        }

    }

    private static void mergeSort(int[] array) {

        int length = array.length;
        if (length <= 1) {
            return;
        } // base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // left array
        int j = 0; // right array

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }

        // recursive calls
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        int i = 0; // keep track of position
        int l = 0; // in charge of left array
        int r = 0; // in charge of right array

        // check conditions for merging

        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }


    }


}
