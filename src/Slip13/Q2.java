package Slip13;

// Define the Operation interface
interface Operation {
    // Constant value of PI
    double PI = 3.142;

    // Abstract method to calculate area
    double area();

    // Abstract method to calculate volume
    double volume();
}

// Define the Q2 class that implements the Operation interface
class Q2 implements Operation {
    // Member variable for the radius
    private double radius;

    // Constructor to initialize the radius
    public Q2(double radius) {
        this.radius = radius;
    }

    // Implement the area method to calculate the area of the circle
    @Override
    public double area() {
        // Area of the circle = PI * r^2
        return PI * radius * radius;
    }

    // Implement the volume method (for a circle, volume is not applicable, returning 0)
    @Override
    public double volume() {
        // Circle doesn't have a volume; returning 0
        return 0;
    }

    // Method to display the area and volume
    public void display() {
        System.out.println("Circle Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Volume: " + volume());
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create a Q2 object with given radius
        Q2 circle = new Q2(5.0); // Example radius = 5.0

        // Display the calculated area and volume
        circle.display();
    }
}

