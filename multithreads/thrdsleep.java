public class thrdsleep extends Thread {
    
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " is running... iteration " + i);
                try {
                    Thread.sleep(2000); // Sleeping for 500 milliseconds
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " interrupted.");
                }
            }
        }
    
        public static void main(String[] args) {
            thrdsleep t1 = new thrdsleep();
            thrdsleep t2 = new thrdsleep();
            thrdsleep t3 = new thrdsleep();
    
            t1.setName("Thread 1");
            t2.setName("Thread 2");
            t3.setName("Thread 3");
    
            t1.start();
            t2.start();
            t3.start();
        }
    
}
