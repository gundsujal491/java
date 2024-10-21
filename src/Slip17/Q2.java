package Slip17;

class Student {
    // Attributes
    private int rollno;
    private String name;

    // Static variable to keep count of objects created
    private static int objectCount = 0;

    // Default constructor
    public Student() {
        this.rollno = 0;
        this.name = "Unknown";
        objectCount++;
        displayObjectCount();
    }

    // Parameterized constructor
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        objectCount++;
        displayObjectCount();
    }

    // Method to display object count
    private void displayObjectCount() {
        System.out.println("Total Student objects created: " + objectCount);
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll No: " + rollno + ", Name: " + name);
    }
}

// Main class to test the functionality
public class Q2 {
    public static void main(String[] args) {
        // Creating Student objects using parameterized constructor
        Student student1 = new Student(101, "Alice");
        student1.displayDetails();

        Student student2 = new Student(102, "Bob");
        student2.displayDetails();

        // Creating a Student object using default constructor
        Student student3 = new Student();
        student3.displayDetails();
    }
}
