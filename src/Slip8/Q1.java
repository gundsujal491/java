package Slip8;

public class Q1 {
    public static void main(String[] args) {
        // Check if a command-line argument is passed
        if (args.length > 0) {
            try {
                // Parse the command-line argument to an integer
                int number = Integer.parseInt(args[0]);
                int reverse = 0;

                // Reverse the number
                while (number != 0) {
                    int digit = number % 10;  // Get the last digit
                    reverse = reverse * 10 + digit;  // Build the reversed number
                    number /= 10;  // Remove the last digit
                }

                // Display the reversed number
                System.out.println("Reversed Number: " + reverse);

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        } else {
            System.out.println("Please provide a number as a command line argument.");
        }
    }
}

