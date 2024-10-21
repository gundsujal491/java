package Slip12;

public class Q2 {// Abstract class Shape with abstract methods for area and volume
    abstract static class Shape {

    }

    // Derived class Cylinder from Shape
    static class Cylinder extends Shape {
        // Radius and height of the cylinder
        private final double radius;
        private final double height;

        // Constructor to initialize radius and height
        public Cylinder(double radius, double height) {
            this.radius = radius;
            this.height = height;
        }

        // Method to calculate the surface area of the cylinder
        private double area() {
            // Surface area of a cylinder = 2 * π * r * (r + h)
            return 2 * Math.PI * radius * (radius + height);
        }

        // Method to calculate the volume of the cylinder
        private double volume() {
            // Volume of a cylinder = π * r^2 * h
            return Math.PI * radius * radius * height;
        }

        // Method to display the area and volume of the cylinder
        public void display() {
            System.out.println("Cylinder Radius: " + radius);
            System.out.println("Cylinder Height: " + height);
            System.out.println("Surface Area: " + area());
            System.out.println("Volume: " + volume());
        }

        // Main method to test the functionality
        public static void main(String[] args) {
            // Create a Cylinder object with given radius and height
            Cylinder cylinder = new Cylinder(5.0, 10.0); // Example: radius = 5.0, height = 10.0

            // Display the calculated area and volume
            cylinder.display();
        }
    }

}
