package Slip20;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        // Check if exactly 3 arguments are passed
        if (args.length != 3) {
            System.out.println("Please provide exactly 3 numbers as command line arguments.");
            return;
        }

        // Parse the command line arguments to integers
        int[] numbers = new int[3];
        try {
            for (int i = 0; i < 3; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
            return;
        }

        // Sort the numbers
        Arrays.sort(numbers);

        // Display the sorted numbers
        System.out.println("Sorted numbers: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
    }
}

