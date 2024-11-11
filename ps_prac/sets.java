import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class sets {
    public static void main(String[] args) {
        // HashSet example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple");  // Duplicate will be ignored

        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet example
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Danana");
        linkedHashSet.add("Brange");
        linkedHashSet.add("Apple");  // Duplicate will be ignored

        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet example
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("1anana");
        treeSet.add("Orange");
        treeSet.add("Apple");  // Duplicate will be ignored

        System.out.println("TreeSet: " + treeSet);
    }
}
