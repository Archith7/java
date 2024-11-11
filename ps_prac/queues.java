import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queues {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        Queue<String> priorityQueue = new PriorityQueue<>();

        // Adding elements to the queue
        priorityQueue.add("20");
        priorityQueue.add("5");
        priorityQueue.add("15");
        priorityQueue.add("10");

        // Printing the elements of the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Peek (retrieve) the head of the queue (smallest element)
        System.out.println("Head of the PriorityQueue: " + priorityQueue.peek());

        // Poll (remove) the head of the queue
        System.out.println("Removed from PriorityQueue: " + priorityQueue.poll());
        
        // Final state of the PriorityQueue
        System.out.println("PriorityQueue after poll: " + priorityQueue);


        System.out.println("*****************using linked list***************************");

        
        // Create a LinkedList as a Queue
        Queue<String> linkedListQueue = new LinkedList<>();

        // Adding elements to the queue
        linkedListQueue.add("Apple");
        linkedListQueue.add("Banana");
        linkedListQueue.add("Orange");

        // Printing the elements of the LinkedList Queue
        System.out.println("LinkedList Queue: " + linkedListQueue);

        // Peek (retrieve) the head of the queue
        System.out.println("Head of the LinkedList Queue: " + linkedListQueue.peek());

        // Poll (remove) the head of the queue
        System.out.println("Removed from LinkedList Queue: " + linkedListQueue.poll());

        // Final state of the LinkedList Queue
        System.out.println("LinkedList Queue after poll: " + linkedListQueue);
    

    }
}
