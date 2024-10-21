package Slip7;

import java.util.Scanner;
import java.util.InputMismatchException;
class Student {
    // Data members
    private int rollno;
    private String name;
    private double percentage;

    // Default constructor
    public Student() {
        this.rollno = 0;
        this.name = "Unknown";
        this.percentage = 0.0;
    }

    // Parameterized constructor
    public Student(int rollno, String name, double percentage) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
    }

    // Method to display student details
    public void display() {
        System.out.println("Roll No: " + this.rollno + ", Name: " + this.name + ", Percentage: " + this.percentage);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5]; // Array to store 5 Student objects

        // Accepting details for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("Roll No: ");
            int rollno = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Percentage: ");
            double percentage = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Creating a new Student object using the parameterized constructor
            students[i] = new Student(rollno, name, percentage);
        }

        // Displaying student details
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.display(); // Call display method to show details
        }

        // Close the scanner
        scanner.close();
    }
}

