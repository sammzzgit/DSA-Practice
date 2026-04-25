// Demonstrates basic LinkedList operations in Java
import java.util.*;

class LinkedListBasics {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.addFirst("this");
        list.addLast("is");
        list.add("a");
        list.add("list");

        // Removing elements
        list.removeFirst();
        list.remove();

        // Printing size
        System.out.println("Size: " + list.size());

        // Traversing list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.print("NULL");
    }
}
