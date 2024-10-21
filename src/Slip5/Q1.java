package Slip5;

import java.util.Scanner;

// User-defined exception class
class ZeroException extends Exception {
    public ZeroException(String message) {
        super(message);
    }
}

public class Q1 {

    // Method to calculate factorial
    public static long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            // Read the input number
            int number = scanner.nextInt();

            // Check if the number is zero and throw exception if it is
            if (number == 0) {
                throw new ZeroException("Number is 0");
            }

            // Calculate and display the factorial
            long result = factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);

        } catch (ZeroException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}

