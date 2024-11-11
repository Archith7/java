
import java.util.Scanner;


class power_of_three{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(powt(n));
        
    }
    public static boolean powt(int n){
        if (n==1) {
            return true;
        }
        if(n<=0){
            return false;
        }
        if(n%3==0){
        // System.out.println(n);
        return powt(n/3);
        
        }
        
        return false;
    }
}