package Slip13;

import java.util.LinkedList;
import java.util.Iterator;

public class Q1 {
    public static void main(String[] args) {
        // Create a LinkedList to store fruit names
        LinkedList<String> fruits = new LinkedList<>();

        // Add fruit names to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Orange");

        // Display the contents using an Iterator
        System.out.println("Fruits in the LinkedList:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

