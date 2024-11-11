
// public class threadclass extends Thread {
     
//         public void run(){  
//         System.out.println("thread is running...");  
//         }  


//         public static void main(String args[]){  
//         threadclass t1=new threadclass();  
//         System.out.println("The state of thread t1 after initilization- " + t1.getState());

//         t1.start();  
//         System.out.println("The state of thread t1 after start method- " + t1.getState());
//          }  
        
// }
// Extending Thread class
class threadclass extends Thread {
    private String threadName;

    public threadclass(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is running... iteration " + i);
            try {
                // System.out.println("the state of thread before sleep is"+ this.getState());
                Thread.sleep(2000); // Sleeping for 500 milliseconds
                // System.out.println("the state of thread after sleep is"+ this.getState());
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
    }
    public static void main(String[] args) {
        threadclass t1 = new threadclass("Thread 1");
        threadclass t2 = new threadclass("Thread 2");
        threadclass t3 = new threadclass("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}


  






