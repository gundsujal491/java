package Slip15;

import java.util.LinkedList;
import java.util.ListIterator;

// Define an interface for displaying elements
interface Displayable {
    void displayInReverseOrder();
}

// Define the Q1 class that implements Displayable interface
class Q1 implements Displayable {
    private LinkedList<String> fruits;

    // Constructor to initialize the LinkedList
    public Q1() {
        fruits = new LinkedList<>();
        // Adding fruit names to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Orange");
    }

    // Method to display the contents of the list in reverse order
    @Override
    public void displayInReverseOrder() {
        ListIterator<String> iterator = fruits.listIterator(fruits.size());
        System.out.println("Fruits in Reverse Order:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Q1 fruitList = new Q1();
        fruitList.displayInReverseOrder();
    }
}

