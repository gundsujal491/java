package Slip20;

class Q2 {
    // Instance variables
    private int id;
    private String name;
    private String deptName;
    private double salary;

    // Static variable to keep count of objects created
    private static int objectCount = 0;

    // Default constructor
    public Q2() {
        objectCount++;
    }

    // Parameterized constructor using 'this' keyword
    public Q2(int id, String name, String deptName, double salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        objectCount++; // Increment the object count each time an object is created
    }

    // Static method to get object count
    public static int getObjectCount() {
        return objectCount;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Department Name: " + this.deptName);
        System.out.println("Salary: " + this.salary);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        // Creating objects using the parameterized constructor
        Q2 emp1 = new Q2(101, "Alice", "HR", 50000);
        System.out.println("Object count after creating emp1: " + Q2.getObjectCount());
        emp1.displayDetails();

        Q2 emp2 = new Q2(102, "Bob", "Finance", 60000);
        System.out.println("Object count after creating emp2: " + Q2.getObjectCount());
        emp2.displayDetails();

        Q2 emp3 = new Q2(103, "Charlie", "IT", 70000);
        System.out.println("Object count after creating emp3: " + Q2.getObjectCount());
        emp3.displayDetails();
    }
}
