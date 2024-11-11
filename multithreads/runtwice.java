


    public class runtwice extends Thread{  
        public void run(){  
          System.out.println("running...");  
        }  
        public static void main(String args[]){  
            runtwice t1=new runtwice();  
         t1.start();  
        //  t1.start();  
        //  t1.start();  
        }  
       }  

