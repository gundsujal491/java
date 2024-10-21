package Slip16;

import org.jetbrains.annotations.NotNull;

// Class definition
class Q1 {
    // Private integer data member
    private final int number;

    // Parameterized constructor to initialize the number
    public Q1(int number) {
        this.number = number;
    }

    // Method to check if the number is even
    public boolean isEven() {
        return number % 2 == 0;
    }

    // Main method to test the functionality using command line arguments
    public static void main(@NotNull String[] args) {
        // Check if a command line argument is passed
        if (args.length > 0) {
            try {
                // Parse the command line argument to an integer
                int value = Integer.parseInt(args[0]);

                // Create an object of Q1 using the constructor with value
                Q1 myNum = new Q1(value);

                // Check and display if the number is even or not
                if (myNum.isEven()) {
                    System.out.println(value + " is even.");
                } else {
                    System.out.println(value + " is odd.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        } else {
            System.out.println("Please pass a number as a command line argument.");
        }
    }
}

