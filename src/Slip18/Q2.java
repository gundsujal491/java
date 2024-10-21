package Slip18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q2 {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "C:\\Users\\Admin\\IdeaProjects\\Slips of Java\\abc.txt";

        // Use try-with-resources to ensure the BufferedReader is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Convert each line to uppercase and print it
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            // Handle potential IO exceptions
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

