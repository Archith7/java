import java.util.*;
public class happy {
    public static int sumofsquares(int num){
        int sum=0;
        while(num>0){
            int rem= num%10;
            sum =sum+rem*rem;
            num=num/10;
        }
       return sum;
    }
    public static boolean check(int x){
       while (x!=1 && ) {
        
       }
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a+"in main");
        // int x= hap(a);
        check(a);
    }
}
