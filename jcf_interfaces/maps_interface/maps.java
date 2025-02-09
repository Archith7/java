import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        // ==========================
        // HashMap Example (Unordered)
        // ==========================
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Three");
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(4, "Four");

        System.out.println("HashMap: " + hashMap);
        // Output: HashMap: {1=One, 2=Two, 3=Three, 4=Four} (Order may vary)

        // Accessing values
        System.out.println("Value for key 2: " + hashMap.get(2)); // Two

        // Checking if a key exists
        System.out.println("Contains key 3? " + hashMap.containsKey(3)); // true

        // Checking if a value exists
        System.out.println("Contains value 'Five'? " + hashMap.containsValue("Five")); // false

        // Removing an entry
        hashMap.remove(4);
        System.out.println("After removing key 4: " + hashMap);
        // Output: {1=One, 2=Two, 3=Three} (Order may vary)

        // Iterating through HashMap
        System.out.print("Iterating over HashMap: ");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
        System.out.println();
        // Output: 1=One 2=Two 3=Three (Order may vary)

        // Checking size
        System.out.println("Size: " + hashMap.size()); // Output: 3

        // ==========================
        // LinkedHashMap Example (Insertion Order)
        // ==========================
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(4, "Four");

        System.out.println("\nLinkedHashMap: " + linkedHashMap);
        // Output: LinkedHashMap: {3=Three, 1=One, 2=Two, 4=Four} (Maintains insertion order)

        // Accessing values
        System.out.println("Value for key 1: " + linkedHashMap.get(1)); // One

        // Removing an entry
        linkedHashMap.remove(2);
        System.out.println("After removing key 2: " + linkedHashMap);
        // Output: {3=Three, 1=One, 4=Four} (Maintains insertion order)

        // Iterating through LinkedHashMap
        System.out.print("Iterating over LinkedHashMap: ");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
        System.out.println();
        // Output: 3=Three 1=One 4=Four (Insertion order preserved)

        // Checking size
        System.out.println("Size: " + linkedHashMap.size()); // Output: 3

        // ==========================
        // TreeMap Example (Sorted Order)
        // ==========================
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");

        System.out.println("\nTreeMap (Sorted Order): " + treeMap);
        // Output: TreeMap (Sorted Order): {1=One, 2=Two, 3=Three, 4=Four}

        // Accessing values
        System.out.println("Value for key 3: " + treeMap.get(3)); // Three

        // Removing an entry
        treeMap.remove(1);
        System.out.println("After removing key 1: " + treeMap);
        // Output: {2=Two, 3=Three, 4=Four}

        // Iterating through TreeMap
        System.out.print("Iterating over TreeMap: ");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
        System.out.println();
        // Output: 2=Two 3=Three 4=Four (Sorted order)

        // First and Last Keys
        System.out.println("First key: " + ((TreeMap<Integer, String>) treeMap).firstKey()); // 2
        System.out.println("Last key: " + ((TreeMap<Integer, String>) treeMap).lastKey()); // 4

        // Lower and Higher Keys
        System.out.println("Lower key than 3: " + ((TreeMap<Integer, String>) treeMap).lowerKey(3)); // 2
        System.out.println("Higher key than 3: " + ((TreeMap<Integer, String>) treeMap).higherKey(3)); // 4

        // Checking size
        System.out.println("Size: " + treeMap.size()); // Output: 3
    }
}
