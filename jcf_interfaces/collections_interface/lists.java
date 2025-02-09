import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.Iterator;

public class ListExample {
    public static void main(String[] args) {
        // ==========================
        // ArrayList Example
        // ==========================
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Apple"); // Allows duplicates

        System.out.println("ArrayList: " + arrayList); 
        // Output: [Apple, Banana, Orange, Apple]

        // Accessing elements by index
        System.out.println("Element at index 1: " + arrayList.get(1)); // Banana

        // Updating an element
        arrayList.set(1, "Mango");
        System.out.println("After set(1, 'Mango'): " + arrayList); 
        // Output: [Apple, Mango, Orange, Apple]

        // Removing an element
        arrayList.remove(2); // Removes "Orange"
        System.out.println("After remove(2): " + arrayList);
        // Output: [Apple, Mango, Apple]

        // Iterating over ArrayList
        System.out.print("Iterating over ArrayList: ");
        for (String fruit : arrayList) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        // Output: Apple Mango Apple

        // Checking if an element exists
        System.out.println("Contains 'Mango'? " + arrayList.contains("Mango")); // true

        // Getting size
        System.out.println("Size: " + arrayList.size()); // Output: 3

        // Clearing ArrayList
        arrayList.clear();
        System.out.println("Is ArrayList empty? " + arrayList.isEmpty()); // true


        // ==========================
        // LinkedList Example
        // ==========================
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Elephant");
        linkedList.add("Dog"); // Allows duplicates

        System.out.println("\nLinkedList: " + linkedList);
        // Output: [Dog, Cat, Elephant, Dog]

        // Adding at a specific index
        linkedList.add(1, "Tiger");
        System.out.println("After add(1, 'Tiger'): " + linkedList);
        // Output: [Dog, Tiger, Cat, Elephant, Dog]

        // Removing by index
        linkedList.remove(3); // Removes "Elephant"
        System.out.println("After remove(3): " + linkedList);
        // Output: [Dog, Tiger, Cat, Dog]

        // Accessing elements by index
        System.out.println("Element at index 2: " + linkedList.get(2)); // Cat

        // Iterating using an iterator
        System.out.print("Iterating over LinkedList: ");
        Iterator<String> linkedIterator = linkedList.iterator();
        while (linkedIterator.hasNext()) {
            System.out.print(linkedIterator.next() + " ");
        }
        System.out.println();
        // Output: Dog Tiger Cat Dog

        // Checking if an element exists
        System.out.println("Contains 'Lion'? " + linkedList.contains("Lion")); // false

        // Getting size
        System.out.println("Size: " + linkedList.size()); // Output: 4

        // Clearing LinkedList
        linkedList.clear();
        System.out.println("Is LinkedList empty? " + linkedList.isEmpty()); // true


        // ==========================
        // Vector Example
        // ==========================
        List<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        System.out.println("\nVector: " + vector);
        // Output: [10, 20, 30, 40]

        // Accessing by index
        System.out.println("Element at index 2: " + vector.get(2)); // 30

        // Updating an element
        vector.set(1, 25);
        System.out.println("After set(1, 25): " + vector);
        // Output: [10, 25, 30, 40]

        // Removing an element
        vector.remove(Integer.valueOf(30));
        System.out.println("After remove(30): " + vector);
        // Output: [10, 25, 40]

        // Iterating using forEach
        System.out.print("Iterating over Vector: ");
        vector.forEach(num -> System.out.print(num + " "));
        System.out.println();
        // Output: 10 25 40

        // Checking if an element exists
        System.out.println("Contains 25? " + vector.contains(25)); // true

        // Getting size
        System.out.println("Size: " + vector.size()); // Output: 3

        // Clearing Vector
        vector.clear();
        System.out.println("Is Vector empty? " + vector.isEmpty()); // true
    }
}
