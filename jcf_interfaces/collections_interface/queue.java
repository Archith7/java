import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.ArrayDeque;

public class QueueExample {
    public static void main(String[] args) {
        // ==========================
        // LinkedList as a Queue (FIFO)
        // ==========================
        Queue<String> linkedListQueue = new LinkedList<>();
        linkedListQueue.offer("Apple");
        linkedListQueue.offer("Banana");
        linkedListQueue.offer("Orange");

        System.out.println("LinkedList Queue: " + linkedListQueue);
        // Output: [Apple, Banana, Orange]

        // Removing elements (FIFO)
        System.out.println("Poll(): " + linkedListQueue.poll()); // Apple (removed)
        System.out.println("After poll: " + linkedListQueue);
        // Output: [Banana, Orange]

        // Peeking (front element)
        System.out.println("Peek(): " + linkedListQueue.peek()); // Banana

        // Checking size
        System.out.println("Size: " + linkedListQueue.size()); // Output: 2

        // ==========================
        // PriorityQueue (Min-Heap Order)
        // ==========================
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(40);
        priorityQueue.offer(10);
        priorityQueue.offer(30);
        priorityQueue.offer(20);

        System.out.println("\nPriorityQueue (Sorted Order): " + priorityQueue);
        // Output: [10, 20, 30, 40] (internally stored in heap order)

        // Removing elements (Always removes the smallest first)
        System.out.println("Poll(): " + priorityQueue.poll()); // 10 (removed)
        System.out.println("After poll: " + priorityQueue);
        // Output: [20, 40, 30]

        // Peeking (smallest element)
        System.out.println("Peek(): " + priorityQueue.peek()); // 20

        // Checking size
        System.out.println("Size: " + priorityQueue.size()); // Output: 3

        // ==========================
        // ArrayDeque (Double-Ended Queue)
        // ==========================
        Queue<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer("A");
        arrayDeque.offer("B");
        arrayDeque.offer("C");

        System.out.println("\nArrayDeque: " + arrayDeque);
        // Output: [A, B, C]

        // Removing elements (FIFO)
        System.out.println("Poll(): " + arrayDeque.poll()); // A (removed)
        System.out.println("After poll: " + arrayDeque);
        // Output: [B, C]

        // Peeking (front element)
        System.out.println("Peek(): " + arrayDeque.peek()); // B

        // Checking size
        System.out.println("Size: " + arrayDeque.size()); // Output: 2
    }
}
