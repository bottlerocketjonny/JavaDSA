package javaDSA.examples;

//====================EXAMPLES=======================//
//==============fastest to slowest===================//

// O(1) CONSTANT TIME
// random access of elements in an array
// inserting at beginning of linked list

// O(log n) LOGARITHMIC TIME
// binary search

// O(n) LINEAR TIME
// looping through elements in an array
// searching through a linked list

// O(n log n) QUASILINEAR TIME
// quicksort
// mergesort
// heapsort

// O(n^2) QUADRATIC TIME
// insertion sort
// selection sort
// bubble sort

// O(n!) FACTORIAL TIME
// traveling salesman problem

public class BigONotation {

    // O(n) linear time
    // this function goes up in proportion with the number. so if n was 1000000 it would take that many steps...
    // as we are iterating from zero to n.
    int addUpLinear(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    // O(1) constant time
    // this function would only take 3 steps to return the same sum. far superior!
    // even though there is 3 steps, we still refer to this as O(n) as small operation are insignificant!
    int addUpConstant(int n) {
        int sum = n * (n + 1) / 2;
        return sum;
    }


}
