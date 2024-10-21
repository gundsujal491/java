package Slip2;

/*Write a program to accept Doctor Name from the user and check whether it is valid or not.(It
should not contain digits and special symbol) If it is not valid then throw user defined Exception -
Name is Invalid -- otherwise display the name.*/

import java.util.Scanner;

// User-defined exception for invalid name
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

public class ORQ2 {
    // Method to validate the doctor name
    public static void validateName(String name) throws InvalidNameException {
        // Regular expression to check if the name contains any digits or special characters
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new InvalidNameException("Name is Invalid: It should not contain digits or special characters.");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Accept doctor name from the user
        System.out.print("Enter Doctor's Name: ");
        String doctorName = scanner.nextLine();

        try {
            // Validate the doctor's name
            validateName(doctorName);
            // If no exception, display the name
            System.out.println("Doctor's Name is valid: " + doctorName);
        } catch (InvalidNameException e) {
            // Catch and display the custom exception message
            System.out.println(e.getMessage());
        }

        // Close the scanner
        scanner.close();
    }
}
