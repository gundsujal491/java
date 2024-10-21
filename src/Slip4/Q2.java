package Slip4;

import java.util.Scanner;
import java.util.InputMismatchException;

class Product {
    // Data members
    int id;
    String name;
    double price;

    // Constructor to initialize Product object
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Q2 {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Create an array to hold 5 Product objects
        Product[] products = new Product[5];

        // Input the details of 5 products
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");

            // Input for Product ID
            int id = 0;
            while (true) {
                try {
                    System.out.print("Product ID: ");
                    id = scanner.nextInt();
                    break; // Exit the loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid integer for Product ID.");
                    scanner.next(); // Clear the invalid input
                }
            }
            scanner.nextLine(); // Consume newline

            // Input for Product Name
            System.out.print("Product Name: ");
            String name = scanner.nextLine();

            // Input for Product Price
            double price = 0;
            while (true) {
                try {
                    System.out.print("Product Price: ");
                    price = scanner.nextDouble();
                    break; // Exit the loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid number for Product Price.");
                    scanner.next(); // Clear the invalid input
                }
            }

            // Initialize a Product object and store it in the array
            products[i] = new Product(id, name, price);
        }

        // Find the product with the minimum price
        Product minPriceProduct = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].price < minPriceProduct.price) {
                minPriceProduct = products[i];
            }
        }

        // Display the name of the product with the minimum price
        System.out.println("\nProduct with the minimum price is: " + minPriceProduct.name);

        // Close the scanner
        scanner.close();
    }
}


/*Enter details for Product 1:
Product ID: 1
Product Name: Laptop
Product Price: 50000

Enter details for Product 2:
Product ID: 2
Product Name: Phone
Product Price: 30000

Enter details for Product 3:
Product ID: 3
Product Name: Tablet
Product Price: 20000

Enter details for Product 4:
Product ID: 4
Product Name: Monitor
Product Price: 10000

Enter details for Product 5:
Product ID: 5
Product Name: Keyboard
Product Price: 2000

Product with the minimum price is: Keyboard
*/