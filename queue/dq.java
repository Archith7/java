
// import java.util.ArrayDeque;
// import java.util.Deque;
// import java.util.Iterator;

// public class dq {
//     public static void main(String[] args) {
//         Deque<String> d= new ArrayDeque<>();
//         d.add("a");
//         d.add("b");
//         d.add("c");
//         d.add("d");

//         Iterator i = d.iterator();
//         while(i.hasNext()){
//             System.out.println(i.next());
//         }
//     }
// }


// dq.java

import java.util.NoSuchElementException;

public class dq<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public dq() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(T element) {
        Node<T> newNode = new Node<>(element);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        T element = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
        return element;
    }

    public T removeLast() {
        if (tail == null) {
            throw new NoSuchElementException();
        }
        T element = tail.data;
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        size--;
        return element;
    }

    public T getFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

    public T getLast() {
        if (tail == null) {
            throw new NoSuchElementException();
        }
        return tail.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        dq<String> dq = new dq<>();

        dq.addFirst("hello");
        dq.addLast("world");

        System.out.println(dq.getFirst()); // prints "hello"
        System.out.println(dq.getLast()); // prints "world"

        dq.removeFirst();
        System.out.println(dq.getFirst()); // prints "world"
    }
}