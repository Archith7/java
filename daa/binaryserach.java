import java.util.*;
public class binaryserach {
    
        public static void binary(int[] l ,int a, int b,int  x){
            // System.out.println(l.length);
            // int low=0;
            // int high= l.length-1;
            int mid= (a+b)/2;

            if(l[mid]== x){
                System.out.println("Element is present at index " + mid);
            }
            else if(l[mid] > x ){
                binary(l,0,mid-1,x);
            }
            else if(l[mid] < x ){
                binary(l,mid+1,l.length-1,x);
            }
            else{
                System.out.println("Element is not present in array");
            }
        }
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            int [] l = new int[n];
            for( int i=0; i<n; i++){
                l[i]= sc.nextInt();
            }
            int a=0;
            int b=l.length-1;
            int x= sc.nextInt();
            binary(l,a,b, x);
            
        
    }
}
