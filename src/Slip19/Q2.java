package Slip19;

import java.util.Scanner;

// Abstract class Order
abstract class Order {
    protected int id;
    protected String description;

    // Abstract methods to be implemented in subclass
    abstract void accept();
    abstract void display();
}

// Subclass PurchaseOrder
class PurchaseOrder extends Order {
    private String customerName;

    // Scanner for input
    private static Scanner scanner = new Scanner(System.in);

    @Override
    void accept() {
        System.out.print("Enter Order ID: ");
        id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Order Description: ");
        description = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        customerName = scanner.nextLine();
    }

    @Override
    void display() {
        System.out.println("Order ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Customer Name: " + customerName);
        System.out.println("-------------------------");
    }
}

public class Q2 {
    public static void main(String[] args) {
        // Array to hold PurchaseOrder objects
        PurchaseOrder[] orders = new PurchaseOrder[3];

        // Accept details for each PurchaseOrder
        for (int i = 0; i < orders.length; i++) {
            System.out.println("Enter details for Purchase Order " + (i + 1) + ":");
            orders[i] = new PurchaseOrder();
            orders[i].accept();
        }

        // Display details of each PurchaseOrder
        System.out.println("\nPurchase Orders Details:");
        for (PurchaseOrder order : orders) {
            order.display();
        }
    }
}
