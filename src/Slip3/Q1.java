package Slip3;
/*Write a program to accept the 'n' different numbers from user and store it in array. Also print
the sum of elements of the array.*/

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the number of elements
        System.out.print("Enter the number of elements you want to store: ");
        int n = scanner.nextInt();

        // Create an array to store 'n' elements
        int[] numbers = new int[n];

        // Input 'n' numbers from the user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of the array elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        // Display the elements and the sum
        System.out.println("The elements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nSum of the array elements: " + sum);

        // Close the scanner
        scanner.close();
    }
}
/*Enter the number of elements you want to store: 5
Enter 5 numbers:
10
20
30
40
50
The elements of the array are:
10 20 30 40 50
Sum of the array elements: 150
*/
