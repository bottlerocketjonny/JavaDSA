package javaDSA.examples.dynamicarrays;

// new String[] = static array. index numbers uses O(1) constant time - random access. inserting = 0(n). FIXED capacity
// Dynamic Array is an array with a resizable capacity = ArrayList!
// Basically an array within an array
// Wastes more memory than a LinkedList as you can only double the capacity

public class DynamicArrayExample {

    public static void main(String[] args) {
        // ArrayList<String> arrayList = new ArrayList<>(); <==== this is how you would do it IRL
        DynamicArray dynamicArray = new DynamicArray(5);
        System.out.println(dynamicArray.capacity);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

//        dynamicArray.insert(0, "X");
//        dynamicArray.delete("A");
//        System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());

    }



}


