package javaDSA.examples;

// sorting algo that compares adjacent elements and checks if they're in the right order
// if not, then elements are continually switched until all elements are in the right order
// imagine that we are underwater. heavy things sink to the bottom, light things float to the top.
// O(n^2) - quadratic time. not the most efficient sorting algo

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {8,4,5,6,3,8,0,6,8,9,2,1};
        // Arrays.sort(array); - usual way to sort

        bubbleSort(array);

        for (int i: array) {
            System.out.println(i);
        }
    }

    private static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {                // iterate through length of array
            for (int j = 0; j < array.length - i - 1; j++) {        // j = index before i / adjacent element
                if(array[j] > array[j+1]) {                         // if element to left is greater, switch it! swap for descending
                    int temp = array[j];                            // store in temp variable
                    array[j] = array[j+1];                          // move element back one index
                    array[j+1] = temp;                              // overwrite next element with temp var
                }
            }
        }
    }

}
