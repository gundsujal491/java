package Slip8;

import java.util.Scanner;

// Custom Exception Class
class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

// MyDate class
class MyDate {
    private int day;
    private int month;
    private int year;

    // Method to accept date
    public void acceptDate() throws InvalidDateException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date (dd mm yyyy): ");

        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();

        // Validate date
        validateDate(day, month, year);
    }

    // Method to validate the date
    private void validateDate(int day, int month, int year) throws InvalidDateException {
        if (month < 1 || month > 12) {
            throw new InvalidDateException("Invalid month: " + month);
        }

        // Check for days in each month
        int daysInMonth;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                // Leap year check
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29; // Leap year
                } else {
                    daysInMonth = 28; // Non-leap year
                }
                break;
            default:
                daysInMonth = 0; // This should never happen due to month validation
        }

        if (day < 1 || day > daysInMonth) {
            throw new InvalidDateException("Invalid date: " + day + " for month: " + month);
        }
    }

    // Method to display the date
    public void displayDate() {
        System.out.printf("Date: %02d/%02d/%d%n", day, month, year);
    }
}

// Main class
public class Q2 {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        try {
            date.acceptDate();
            date.displayDate();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}

