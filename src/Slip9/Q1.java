package Slip9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(reader.readLine());

            if (isPerfect(number)) {
                System.out.println(number + " is a perfect number.");
            } else {
                System.out.println(number + " is not a perfect number.");
            }
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }

    // Method to check if a number is perfect
    public static boolean isPerfect(int number) {
        if (number <= 0) {
            return false; // Perfect numbers are positive integers
        }

        int sum = 0;
        // Calculate the sum of proper divisors
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number; // Check if sum of divisors equals the number
    }
}

