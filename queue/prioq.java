import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class prioq {

    public static void main(String[] args) {
        // Default priority queue (min-heap) with natural ordering
        PriorityQueue<Integer> defaultPriorityQueue = new PriorityQueue<>();
        
        // Add elements to the priority queue
        defaultPriorityQueue.add(10);
        defaultPriorityQueue.add(20);
        defaultPriorityQueue.add(15);
        defaultPriorityQueue.add(5);
        
        // Print elements in the priority queue
        System.out.println("Default Priority Queue (natural ordering):");
        while (!defaultPriorityQueue.isEmpty()) {
            System.out.print(defaultPriorityQueue.poll() + " ");
        }
        System.out.println();
        
        // Custom priority queue (max-heap) with custom comparator
        PriorityQueue<Integer> customPriorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        
        // Add elements to the priority queue
        customPriorityQueue.add(10);
        customPriorityQueue.add(20);
        customPriorityQueue.add(15);
        customPriorityQueue.add(5);
        
        System.out.println("Custom Priority Queue (reverse ordering):");
        Iterator i= customPriorityQueue.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
        
        // Priority Queue with custom objects
        System.out.println("Highest priority element in custom queue: " + customPriorityQueue.remove());
        System.out.println("Highest priority element in custom queue: " + customPriorityQueue.poll());
        Iterator j = customPriorityQueue.iterator();
        while(j.hasNext()){
            System.out.print(j.next()+" ");
        }
        
        
    }
}


