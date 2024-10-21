/*Write a program to accept ‘n’ integers from the user & store them in an Array List collection.
Display the elements of Array List. */
package Slip2;
import java.util.ArrayList;
import java.util.Scanner;
public class Q1 {
        public static void main(String[] args) {
            // Create a Scanner object for input
            Scanner scanner = new Scanner(System.in);

            // Create an ArrayList to store integers
            ArrayList<Integer> numbers = new ArrayList<>();

            // Accept the number of elements
            System.out.print("Enter the number of integers you want to input: ");
            int n = scanner.nextInt();

            // Loop to accept n integers from the user
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();  // Read the integer
                numbers.add(num);  // Add the integer to the ArrayList
            }

            // Display the elements of the ArrayList
            System.out.println("Elements in the ArrayList: " + numbers);

            // Close the scanner
            scanner.close();
        }
    }

