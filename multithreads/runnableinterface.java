// Implementing Runnable interface
class runnableinterface implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        runnableinterface myRunnable = new runnableinterface(); // Creating a runnable object
        Thread t1 = new Thread(myRunnable); // Creating a thread and passing the runnable object to it
        t1.start(); // Starting the thread
    }
}


// public class runnableinterface {
//     // Implementing Runnable interface
// class runnableinterface implements Runnable {
//     private String threadName;

//     public runnableinterface(String name) {
//         threadName = name;
//     }

//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println(threadName + " is running... iteration " + i);
//             try {
//                 Thread.sleep(500); // Sleeping for 500 milliseconds
//             } catch (InterruptedException e) {
//                 System.out.println(threadName + " interrupted.");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Thread t1 = new Thread(new runnableinterface("Thread 1"));
//         Thread t2 = new Thread(new runnableinterface("Thread 2"));
//         Thread t3 = new Thread(new runnableinterface("Thread 3"));

//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }
// }




    


