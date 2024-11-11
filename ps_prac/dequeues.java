import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class dequeues {
    public static void main(String[] args) {
        // Create an ArrayDeque as a Queue
        Deque<String> arrayDequeQueue = new ArrayDeque<>();

        // Adding elements to the queue
        arrayDequeQueue.addLast("Cat");
        arrayDequeQueue.addLast("Dog");
        arrayDequeQueue.addLast("Horse");

        // Printing the elements of the ArrayDeque Queue
        System.out.println("ArrayDeque Queue: " + arrayDequeQueue);

        // Peek (retrieve) the head of the queue
        System.out.println("Head of the ArrayDeque Queue: " + arrayDequeQueue.peekLast());

        // Poll (remove) the head of the queue
        System.out.println("Removed from ArrayDeque Queue: " + arrayDequeQueue.pollFirst());

        // Final state of the ArrayDeque Queue
        System.out.println("ArrayDeque Queue after poll: " + arrayDequeQueue);

       System.out.println("******************using Linked lIst******************");
        // Create a LinkedList as a Deque (Queue)
        Deque<Integer> linkedListDequeQueue = new LinkedList<>();

        // Adding elements to the queue
        linkedListDequeQueue.addLast(100);
        linkedListDequeQueue.addLast(200);
        linkedListDequeQueue.addLast(300);

        // Printing the elements of the LinkedList Deque Queue
        System.out.println("LinkedList Deque Queue: " + linkedListDequeQueue);

        // Peek (retrieve) the head of the queue
        System.out.println("Head of the LinkedList Deque Queue: " + linkedListDequeQueue.peekFirst());

        // Poll (remove) the head of the queue
        System.out.println("Removed from LinkedList Deque Queue: " + linkedListDequeQueue.pollFirst());

        // Final state of the LinkedList Deque Queue
        System.out.println("LinkedList Deque Queue after poll: " + linkedListDequeQueue);
 

    }
}
