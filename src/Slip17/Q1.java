package Slip17;

class MyNumber {
    // Private integer data member
    private final int number;

    // Parameterized constructor to initialize the number
    public MyNumber(int number) {
        this.number = number;
    }

    // Method to check if the number is odd
    public boolean isOdd() {
        return number % 2 != 0;
    }
}

// Main class to test the functionality
public class Q1 {
    public static void main(String[] args) {
        // Check if a command line argument is passed
        if (args.length > 0) {
            try {
                // Parse the command line argument to an integer
                int value = Integer.parseInt(args[0]);

                // Create an object of MyNumber using the constructor with value
                MyNumber myNum = new MyNumber(value);

                // Check if the number is odd and display the result
                if (myNum.isOdd()) {
                    System.out.println(value + " is an odd number.");
                } else {
                    System.out.println(value + " is not an odd number.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        } else {
            System.out.println("Please pass a number as a command line argument.");
        }
    }
}

