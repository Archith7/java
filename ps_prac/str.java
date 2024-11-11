
import java.util.*;

public class str {

    public static void main(String[] args) {
        int[] array = {10, 30, 10, 30, 50};
        // int index = Arrays.binarySearch(array, 30);  // index = 2
        // System.out.println("index:"+index);

        Arrays.sort(array);
        List<String> x=Arrays.asList(array);
        System.out.println(array);
    }
}
