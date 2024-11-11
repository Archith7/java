import java.util.*;

public class lists {
    public static void main(String[] args) {
        // ArrayList example
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Apple");  // Duplicate is allowed
        String s="arc";
        char ch='a';
        Character.isLetter(ch);
        
        System.out.println("ArrayList: " + arrayList);
        System.out.println("ArrayList: " + arrayList.get(0));//to print the element at the index 1
        // LinkedList example
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);  // Duplicate is allowed

        System.out.println("LinkedList: " + linkedList);
    }
}
// List<String> list =new ArrayList<>();