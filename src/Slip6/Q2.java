package Slip6;

import java.util.Scanner;

class Employee {
    // Data members for Employee class
    private int id;
    private String name;
    private double salary;

    // Constructor to initialize Employee object
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Employee[] employees = new Employee[n]; // Array to store Employee objects

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            employees[i] = new Employee(id, name, salary); // Create Employee object and store it in array
        }

        // Finding the employee with the maximum salary
        Employee maxSalaryEmployee = employees[0];

        for (int i = 1; i < n; i++) {
            if (employees[i].getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employees[i];
            }
        }

        // Display the name of the employee with the maximum salary
        System.out.println("Employee with maximum salary: " + maxSalaryEmployee.getName());

        // Close the scanner
        scanner.close();
    }
}

