import java.util.*;
public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List <Integer> l= new ArrayList<>();
        for(int i=0;i<n;i++){
            int x= sc.nextInt();
            l.add(x);
        }

        int k =sc.nextInt();

        for (int i = 0; i < k; i++) {
            
        
        l.add(0,l.get(n-1));

        // System.out.println(l);
        l.remove(n);
        // System.out.println(l);
        }
         System.out.println(l);

    }
}
