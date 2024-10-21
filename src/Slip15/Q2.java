package Slip15;

// Superclass
class Employee {
    // Member variables
    protected String name;
    protected double salary;

    // Constructor to initialize Employee details
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
class Developer extends Employee {
    // Additional member variable for Developer
    private String projectName;

    // Constructor to initialize Developer details
    public Developer(String name, double salary, String projectName) {
        super(name, salary); // Call the constructor of the superclass
        this.projectName = projectName;
    }

    // Method to display developer details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call display method from Employee
        System.out.println("Project Name: " + projectName);
    }
}

// Main class to test the functionality
public class Q2 {
    public static void main(String[] args) {
        // Create an object of Developer
        Developer dev = new Developer("Alice", 80000, "AI Project");

        // Display the details of the Developer
        dev.displayDetails();
    }
}

