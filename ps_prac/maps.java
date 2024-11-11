
import java.util.*;

public class maps {

    public static void main(String[] args) {
        // HashMap example
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(12, "Banana");
        hashMap.put(3, "Orange");
        hashMap.put(1, "Grapes");  // Replaces the value for key 1

        System.out.println("HashMap: " + hashMap);

        
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // LinkedHashMap example
        // Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        // linkedHashMap.put(1, "Apple");
        // linkedHashMap.put(12, "Banana");
        // linkedHashMap.put(3, "Orange");
        // linkedHashMap.put(1, "Grapes");  // Replaces the value for key 1
        // System.out.println("LinkedHashMap: " + linkedHashMap);
        // // TreeMap example
        // Map<Integer, String> treeMap = new TreeMap<>();
        // treeMap.put(12, "Apple");
        // treeMap.put(2, "Banana");
        // treeMap.put(3, "Orange");
        // treeMap.put(1, "Grapes");  // Replaces the value for key 1
        // System.out.println("TreeMap: " + treeMap);
    }
}
