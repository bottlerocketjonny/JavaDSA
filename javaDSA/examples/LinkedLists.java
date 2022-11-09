package javaDSA.examples;

import java.util.LinkedList;

public class LinkedLists {

    // SINGLY LINKED LISTS
    // made up of a chain of nodes. head = start. tail = end (null)
    // includes some data along with the address of the next node in the line

    // unlike an array, elements don't need to be shifted around to be inserted
    // take address stored in previous node and assign it to the new node, thus pointing to next node in the line
    // replace address in previous node with address that points to the new node
    // ... and the chain is complete with a lot less CPU power (think millions of elements)
    // to remove element - just point address to next in line
    // uses constant time (more efficient)
    // searching is a lengthier process than arrays as needs to traverse the whole list (linear time)

    // DOUBLY LINKED LISTS
    // two address stored in each node! each node knows where next AND previous node is
    // EASIER to SEARCH, however it uses linear time to insert/remove elements

    public static void main(String[] args) {

        // doubly linked list is default implementation in Java
        LinkedList<String> linkedList = new LinkedList<String>();

        // stack implementation
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//        linkedList.pop(); // remove element at top of stack

        // queue implementation
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
//        linkedList.poll();                               // remove element at head of queue
        linkedList.add(4, "E");             // insert element
        linkedList.remove("E");                        // remove element
        System.out.println(linkedList.indexOf("F"));      // search linkedList

        System.out.println(linkedList);

        System.out.println(linkedList.peekFirst() + linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("Z");

        String first = linkedList.removeFirst();           // store first node in var
        String last = linkedList.removeLast();             // store last node in var


    }
}
