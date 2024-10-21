package Slip5;

// Base class Point
class Point {
    // Members for coordinates
    protected int x, y;

    // Default constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to display the details of Point
    public void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

// Subclass ColorPoint that extends Point
class ColorPoint extends Point {
    // Additional member for color
    private String color;

    // Default constructor
    public ColorPoint() {
        super(); // Call default constructor of Point
        this.color = "Undefined"; // Default color
    }

    // Parameterized constructor
    public ColorPoint(int x, int y, String color) {
        super(x, y); // Call parameterized constructor of Point
        this.color = color;
    }

    // Overriding the display method to include color
    @Override
    public void display() {
        super.display(); // Call display method of Point
        System.out.println("Color: " + color);
    }
}

// Main class to test the functionality
public class Q2 {
    public static void main(String[] args) {
        // Create a Point object using default constructor
        Point p1 = new Point();
        p1.display();

        // Create a Point object using parameterized constructor
        Point p2 = new Point(3, 4);
        p2.display();

        // Create a ColorPoint object using default constructor
        ColorPoint cp1 = new ColorPoint();
        cp1.display();

        // Create a ColorPoint object using parameterized constructor
        ColorPoint cp2 = new ColorPoint(5, 6, "Red");
        cp2.display();
    }
}

