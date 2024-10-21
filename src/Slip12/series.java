package Slip12;

public class series {// Package declaration

        // Method to print the series of squares for 'n' terms
        public void printSquareSeries(int n) {
            System.out.println("Series of squares up to " + n + " terms:");
            for (int i = 1; i <= n; i++) {
                System.out.println(i + " squared: " + (i * i));
            }
        }
    }
