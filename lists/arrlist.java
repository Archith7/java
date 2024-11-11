import java.util.*;

public class arrlist {
    public static void main(String[] args) {
        ArrayList a= new ArrayList();
        a.add(10);
        a.add(20);
        a.add(15);

        Iterator i= a.iterator();
        while(i.hasNext()){
            System.err.println(i.next());
        }
    }
}
