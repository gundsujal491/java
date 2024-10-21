package Slip19;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to hold the numbers
        int[] numbers = new int[n];

        // Accept 'n' different numbers from the user
        System.out.println("Enter " + n + " different numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the maximum number
        int max = numbers[0]; // Assume the first number is the maximum
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if a larger number is found
            }
        }

        // Display the maximum number
        System.out.println("The maximum number is: " + max);

        // Close the scanner
        scanner.close();
    }
}

