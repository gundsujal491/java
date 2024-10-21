package Slip6;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new TreeSet<>(); // Using TreeSet to store unique integers in sorted order

        System.out.print("Enter the number of integers you want to add: ");
        int n = scanner.nextInt();

        // Accept 'n' integers from the user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            numbers.add(number); // TreeSet handles duplicates automatically
        }

        // Display sorted elements
        System.out.println("Sorted unique integers: " + numbers);

        // Searching for a particular element
        System.out.print("Enter an integer to search: ");
        int searchElement = scanner.nextInt();

        // Check if the element exists in the set
        if (numbers.contains(searchElement)) {
            System.out.println("Element " + searchElement + " found in the collection.");
        } else {
            System.out.println("Element " + searchElement + " not found in the collection.");
        }

        // Close the scanner
        scanner.close();
    }
}

