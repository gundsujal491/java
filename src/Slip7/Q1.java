package Slip7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> employeeTable = new HashMap<>(); // HashMap to store employee name and salary

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            employeeTable.put(name, salary); // Store name and salary in the HashMap
        }

        // Display details of the hash table
        System.out.println("\nEmployee Details in Hash Table:");
        for (Map.Entry<String, Double> entry : employeeTable.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Salary: " + entry.getValue());
        }

        // Close the scanner
        scanner.close();
    }
}

