package Slip18;

import org.jetbrains.annotations.NotNull;

public class Q1 {
    public static void main(@NotNull String[] args) {
        // Check if a command line argument is passed
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        try {
            // Parse the command line argument to an integer
            int number = Integer.parseInt(args[0]);

            // Check if the number is greater than zero
            if (number <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            System.out.println("Factors of " + number + " are:");

            // Loop to find and print factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // New line after printing factors

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}

