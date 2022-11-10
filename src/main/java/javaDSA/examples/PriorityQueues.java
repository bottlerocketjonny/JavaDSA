package javaDSA.examples;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {

    // FIFO data structure
    // serves elements with highest priorities first

    public static void main(String[] args) {

        Queue<Double> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(3.0);
        priorityQueue.offer(2.5);
        priorityQueue.offer(4.0);
        priorityQueue.offer(1.5);
        priorityQueue.offer(2.0);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
            // print queue in order lowest-highest
        }

        Queue<String> priorityQueueReversed = new PriorityQueue<>(Collections.reverseOrder());
        // Collections.reverseOrder to reverse the priority highest-lowest
        // "A" counts as the lowest alphabetically

        priorityQueueReversed.offer("A");
        priorityQueueReversed.offer("D");
        priorityQueueReversed.offer("C");
        priorityQueueReversed.offer("F");
        priorityQueueReversed.offer("B");

        while (!priorityQueueReversed.isEmpty()) {
            System.out.println(priorityQueueReversed.poll());
        }
    }
}
