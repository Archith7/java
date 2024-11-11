
class Counter {
    private int count = 0;

    // Synchronized method to increment the count
    public synchronized void increment() {
        count++;
        System.out.println(count);
    }

    // Method to get the current count
    public int getCount() {
        return count;
    }
}

public class sync {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Thread to increment the counter 1000 times
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
        });

        // Another thread to increment the counter 1000 times
        Thread t2 = new Thread(() -> {
            for (int i = 20; i < 30; i++) {
                counter.increment();
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Print the final count
        System.out.println("Final count: " + counter.getCount());
    }
}