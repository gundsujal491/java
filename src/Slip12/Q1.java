package Slip12;

// Importing the package Series
import Slip12.series;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Scanner to accept input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user for the number of terms
        System.out.print("Enter the number of terms for the square series: ");
        int n = sc.nextInt();

        // Create an object of SquareSeries from the Series package
        series series = new series();

        // Call the method to print the square series
        series.printSquareSeries(n);

        // Close the scanner
        sc.close();
    }
}
