package Slip11;

    // Abstract class Shape with abstract methods area() and volume()
    abstract class Shape {
        // Abstract method for area
        abstract double area();

        // Abstract method for volume
        abstract double volume();
    }

    // Derived class Sphere from Shape
    class Sphere extends Shape {
        // Radius of the sphere
        private final double radius;

        // Constructor to initialize radius
        public Sphere(double radius) {
            this.radius = radius;
        }

        // Method to calculate the surface area of the sphere
        @Override
        public double area() {
            // Surface area of a sphere = 4 * π * r^2
            return 4 * Math.PI * radius * radius;
        }

        // Method to calculate the volume of the sphere
        @Override
        public double volume() {
            // Volume of a sphere = (4/3) * π * r^3
            return (4.0 / 3.0) * Math.PI * radius * radius * radius;
        }

        // Method to display the area and volume
        public void display() {
            System.out.println("Sphere Radius: " + radius);
            System.out.println("Surface Area: " + area());
            System.out.println("Volume: " + volume());
        }

        // Main method to test the functionality
        public static void main(String[] args) {
            // Create a Sphere object with a given radius
            Sphere sphere = new Sphere(5.0); // For example, radius = 5.0

            // Display the calculated area and volume
            sphere.display();
        }
    }

