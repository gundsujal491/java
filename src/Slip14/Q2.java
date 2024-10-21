package Slip14;

// Define the Operation interface
interface Operation {
    double PI = 3.142; // Constant for Pi

    // Method to calculate the area
    double area();

    // Method to calculate the volume
    double volume();
}

// Define the Q2 class that implements the Operation interface
class Q2 implements Operation {
    private double radius;
    private double height;

    // Parameterized constructor to initialize radius and height
    public Q2(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Implement the area method
    @Override
    public double area() {
        return 2 * PI * radius * (radius + height); // Surface area of cylinder
    }

    // Implement the volume method
    @Override
    public double volume() {
        return PI * radius * radius * height; // Volume of cylinder
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create a Q2 object with radius and height
        Q2 cylinder = new Q2(5.0, 10.0);

        // Calculate and display area and volume
        System.out.printf("Area of the Cylinder: %.2f\n", cylinder.area());
        System.out.printf("Volume of the Cylinder: %.2f\n", cylinder.volume());
    }
}
