package pkg_01_08_2025_quee;

import java.util.PriorityQueue;

public class SimplePriorityQueue {

    public static void main(String[] args) {
        // Creating a PriorityQueue of integers (min-heap by default)
        PriorityQueue<Integer> Number = new PriorityQueue<>();

        // Adding elements to the queue using add()
        Number.add(4);
        Number.add(5);

        // Printing the current state of the PriorityQueue
        System.out.println("The PriorityQueue is: " + Number);

        // Adding another element using offer()
        // offer() is similar to add(), but safer in capacity-restricted queues
        Number.offer(1);

        // Printing the updated state of the PriorityQueue
        System.out.println("Updated Queue Accordingly: " + Number);
    }
}
