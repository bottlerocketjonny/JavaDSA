package javaDSA.examples;

import java.util.ArrayList;
import java.util.LinkedList;

// CONCLUSION - mostly arraylist is faster, unless you have to do a lot of inserting/deleting
// arraylist is faster to find index due to random access memory
// linkedlist is faster to delete elements near start coz arraylist has to shift every element to left
// arraylist increases speed if removing near middle as has to shift less elements
// deleting near the end doesn't take very long for either implementation

public class LinkedVsArrayLists {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }
        // LINKED LIST
        startTime = System.nanoTime();
        //linkedList.get(0);
        //linkedList.get(500000);
        //linkedList.get(999999);
        //linkedList.remove(0);
        //linkedList.remove(500000);
        linkedList.remove(999999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        System.out.println("LinkedList: " + elapsedTime + " ns");

        // ARRAY LIST
        startTime = System.nanoTime();
        //arrayList.get(0);
        //arrayList.get(500000);
        //arrayList.get(999999);
        //arrayList.remove(0);
        //arrayList.remove(500000);
        arrayList.remove(999999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        System.out.println("ArrayList: " + elapsedTime + " ns");


    }
}
