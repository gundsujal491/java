package Slip11;

public class Q1 {
    // Data members for day, month, and year
    private int dd;
    private int mm;
    private int yy;

    // Parameterized constructor using 'this' keyword
    public Q1(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    // Method to display the date in dd-mm-yy format
    public void displayDate() {
        System.out.println("Date: " + this.dd + "-" + this.mm + "-" + this.yy);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Creating an object of Q1 (MyDate) and passing day, month, year
        Q1 date = new Q1(21, 10, 2024);

        // Display the date in the required format
        date.displayDate();
    }
}
