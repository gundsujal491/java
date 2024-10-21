package Slip2;
/*Define a class MyNumber having one private integer data member. Write a default constructor
initialize it to 0 and another constructor to initialize it to a value. Write methods isNegative,
isPositive, isOdd, iseven. Use command line argument to pass a value to the object and perform
the above operations.*/
class Q2 {
    // Private integer data member
    private final int number;

    // Constructor to initialize the number with a given value
    public Q2(int number) {
        this.number = number;
    }

    // Method to check if the number is negative
    public boolean isNegative() {
        return number < 0;
    }

    // Method to check if the number is positive
    public boolean isPositive() {
        return number > 0;
    }

    // Method to check if the number is odd
    public boolean isOdd() {
        return number % 2 != 0;
    }

    // Method to check if the number is even
    public boolean isEven() {
        return number % 2 == 0;
    }

    // Main method to test the functionality using command line arguments
    public static void main(String[] args) {
        // Check if a command line argument is passed
        if (args.length > 0) {
            try {
                // Parse the command line argument to an integer
                int value = Integer.parseInt(args[0]);

                // Create an object of Q2 using the constructor with value
                Q2 myNum = new Q2(value);

                // Perform the operations and display the results
                System.out.println("Number: " + value);
                System.out.println("Is Negative: " + myNum.isNegative());
                System.out.println("Is Positive: " + myNum.isPositive());
                System.out.println("Is Odd: " + myNum.isOdd());
                System.out.println("Is Even: " + myNum.isEven());

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        } else {
            System.out.println("Please pass a number as a command line argument.");
        }
    }
}

