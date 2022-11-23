package javaDSA.examples;

// apply the result of a procedure, to the procedure. a function that calls itself!
// can be a substitute for iteration (a repetition of a process).
// divide a problem into sub problems of the same type as the original.
// tends to be used in advanced sorting algorithms and navigating trees.
// easier to read and write but sometimes slower and uses more memory due to adding more operations to call-stack

// needs two things:
// base case - what do we do when we would like to stop
// recursive case - what do we do when we want to continue

public class Recursion {

    public static void main(String[] args) {
//        walk(5);
//        System.out.println(factorial(7));
        System.out.println(power(2, 8));
    }

    private static int power(int base, int exponent) {
        if (exponent < 1) return 1; // base case
        return base * power(base, exponent -1); // recursive case
    }

    private static int factorial(int num) {
        if (num < 1) return 1; // base case
        return num * factorial(num-1); // recursive case
    }


    private static void walk(int steps) {
        //iterative
//        for (int i = 0; i < steps; i++) {
//            System.out.println("You will take a step");
//        }

        //recursive
        if (steps < 1) return;                           // base case
        System.out.println("You will take a step");
        walk(steps-1);                             // recursive case
    }
}
