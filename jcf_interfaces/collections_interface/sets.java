import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class SetExample {
    public static void main(String[] args) {
        // ==========================
        // HashSet Example
        // ==========================
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Duplicate ignored

        System.out.println("HashSet: " + hashSet); 
        // Output: HashSet: [Apple, Orange, Banana] (Order may vary)

        // Checking if an element exists
        System.out.println("Contains 'Banana'? " + hashSet.contains("Banana")); // true

        // Removing an element
        hashSet.remove("Orange");
        System.out.println("After remove 'Orange': " + hashSet); 
        // Output: [Apple, Banana]

        // Iterating through HashSet
        System.out.print("Iterating over HashSet: ");
        for (String fruit : hashSet) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        // Output: Apple Banana (order may vary)

        // Size of HashSet
        System.out.println("Size: " + hashSet.size()); // Output: 2

        // Clearing HashSet
        hashSet.clear();
        System.out.println("Is HashSet empty? " + hashSet.isEmpty()); // true


        // ==========================
        // LinkedHashSet Example
        // ==========================
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Apple"); // Duplicate ignored

        System.out.println("\nLinkedHashSet: " + linkedHashSet); 
        // Output: LinkedHashSet: [Apple, Banana, Orange] (Maintains insertion order)

        // Checking if an element exists
        System.out.println("Contains 'Orange'? " + linkedHashSet.contains("Orange")); // true

        // Removing an element
        linkedHashSet.remove("Banana");
        System.out.println("After remove 'Banana': " + linkedHashSet);
        // Output: [Apple, Orange]

        // Iterating through LinkedHashSet
        System.out.print("Iterating over LinkedHashSet: ");
        Iterator<String> linkedIterator = linkedHashSet.iterator();
        while (linkedIterator.hasNext()) {
            System.out.print(linkedIterator.next() + " ");
        }
        System.out.println();
        // Output: Apple Orange (Insertion order preserved)

        // Size of LinkedHashSet
        System.out.println("Size: " + linkedHashSet.size()); // Output: 2

        // Clearing LinkedHashSet
        linkedHashSet.clear();
        System.out.println("Is LinkedHashSet empty? " + linkedHashSet.isEmpty()); // true


        // ==========================
        // TreeSet Example
        // ==========================
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Apple"); // Duplicate ignored

        System.out.println("\nTreeSet (Sorted Order): " + treeSet);
        // Output: TreeSet (Sorted Order): [Apple, Banana, Orange]

        // Checking if an element exists
        System.out.println("Contains 'Apple'? " + treeSet.contains("Apple")); // true

        // Removing an element
        treeSet.remove("Banana");
        System.out.println("After remove 'Banana': " + treeSet);
        // Output: [Apple, Orange]

        // Iterating through TreeSet
        System.out.print("Iterating over TreeSet: ");
        for (String fruit : treeSet) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        // Output: Apple Orange (Sorted order)

        // First and Last Elements
        System.out.println("First element: " + ((TreeSet<String>) treeSet).first()); // Apple
        System.out.println("Last element: " + ((TreeSet<String>) treeSet).last()); // Orange

        // Higher and Lower
        System.out.println("Higher than 'Apple': " + ((TreeSet<String>) treeSet).higher("Apple")); // Orange
        System.out.println("Lower than 'Orange': " + ((TreeSet<String>) treeSet).lower("Orange")); // Apple

        // HeadSet and TailSet
        System.out.println("HeadSet (Before 'Orange'): " + ((TreeSet<String>) treeSet).headSet("Orange")); // [Apple]
        System.out.println("TailSet (From 'Apple' onwards): " + ((TreeSet<String>) treeSet).tailSet("Apple")); // [Apple, Orange]

        // Size of TreeSet
        System.out.println("Size: " + treeSet.size()); // Output: 2

        // Clearing TreeSet
        treeSet.clear();
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty()); // true
    }
}
