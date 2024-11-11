
    class join extends Thread {
        @Override
        public void run() {
            for (int j = 0; j < 2; j++) {
                try {
                    Thread.sleep(5000);
                    System.out.println("The current thread name is: " + Thread.currentThread().getName());
                } catch (Exception e) {
                    System.out.println("The exception has been caught: " + e);
                }
                System.out.println(j);
            }
        }
        public static void main(String[] args) {
            // Creating 3 threads
            join th1 = new join();
            join th2 = new join();
            join th3 = new join();
    
            try {
                // Starting thread th1 and waiting for it to finish
                th1.start();
                th1.join();
                System.out.println("The 111 thread name is: " + Thread.currentThread().getName());
    
                // Starting thread th2 and waiting for it to finish
                th2.start();
                th2.join();
                System.out.println("The 222 thread name is: " + Thread.currentThread().getName());
    
                // Starting thread th3
                th3.start();
            } catch (Exception e) {
                System.out.println("The exception has been caught: " + e);
            }
        }
    }
    
   
       
    
    

