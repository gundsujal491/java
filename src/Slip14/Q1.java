package Slip14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SuppressWarnings("ALL")
public class Q1 {
    // Database URL, username and password
    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database_name"; // Replace with your database name
    private static final String USER = "your_username"; // Replace with your database username
    private static final String PASS = "your_password"; // Replace with your database password

    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Attempt to establish a connection to the database
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Database connection established successfully!");

        } catch (SQLException e) {
            // Handle SQL exceptions
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();

        } finally {
            // Close the connection if it was successfully established
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Database connection closed.");
                } catch (SQLException e) {
                    System.out.println("Failed to close the connection.");
                    e.printStackTrace();
                }
            }
        }
    }
}

