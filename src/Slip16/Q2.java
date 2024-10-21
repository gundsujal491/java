package Slip16;

// Superclass
class Employee {
    // Members of Employee class
    protected String name;
    protected double salary;

    // Constructor for Employee class
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Subclass
class Programmer extends Employee {
    // Additional member for Programmer class
    private String proglanguage;

    // Constructor for Programmer class
    public Programmer(String name, double salary, String proglanguage) {
        super(name, salary);  // Call to the superclass constructor
        this.proglanguage = proglanguage;
    }

    // Method to display programmer details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call to the superclass method
        System.out.println("Programming Language: " + proglanguage);
    }
}

// Main class to test the functionality
public class Q2 {
    public static void main(String[] args) {
        // Create an object of Programmer
        Programmer programmer = new Programmer("Alice", 75000, "Java");

        // Display the details of the programmer
        programmer.displayDetails();
    }
}

