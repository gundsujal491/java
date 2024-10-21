package Slip9;

// Base class Point
class Point {
    protected int x;
    protected int y;

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

    // Method to display Point coordinates
    public void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

// Subclass Point3D
class Point3D extends Point {
    private int z;

    // Default constructor
    public Point3D() {
        super(); // Call to Point's default constructor
        this.z = 0;
    }

    // Parameterized constructor
    public Point3D(int x, int y, int z) {
        super(x, y); // Call to Point's parameterized constructor
        this.z = z;
    }

    // Override display method to include z coordinate
    @Override
    public void display() {
        System.out.println("3D Point coordinates: (" + x + ", " + y + ", " + z + ")");
    }
}

// Main class to test Point and Point3D
public class Q2 {
    public static void main(String[] args) {
        // Creating and displaying a 2D Point
        Point point2D = new Point(5, 10);
        point2D.display();

        // Creating and displaying a 3D Point
        Point3D point3D = new Point3D(3, 4, 5);
        point3D.display();
    }
}

