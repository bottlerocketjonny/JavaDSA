package javaDSA.examples;

// IN PLACE COMPARISON SORTING ALGORITHM
// keeps track of minimum value during each iteration + then swap
// O (n^2) - quadratic time

// EXPLANATION
// open each box to find the minimum value and store in MIN variable
// place index value at the start of the iteration and place in TEMP variable
// place MIN in index value at start of iteration and TEMP to the index location that MIN originated

public class SelectionSort {

    public static void main(String[] args) {

        int array[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        selectionSort(array);

        for (int i :
                array) {
            System.out.println(i);
        }
    }

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

}
