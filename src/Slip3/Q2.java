package Slip3;

/*Write a program to create class Account (accno, accname, balance). Create an array of 'n'
Account objects. Define static method “sortAccount” which sorts the array on the basis of balance.
Display account details in sorted order.*/

import java.util.Arrays;
import java.util.Scanner;

class Account {
    // Account class data members
    int accno;
    String accname;
    double balance;

    // Constructor to initialize Account object
    public Account(int accno, String accname, double balance) {
        this.accno = accno;
        this.accname = accname;
        this.balance = balance;
    }

    // Static method to sort an array of Account objects by balance
    public static void sortAccount(Account[] accounts) {
        Arrays.sort(accounts, (a1, a2) -> Double.compare(a1.balance, a2.balance));
    }

    // Method to display account details
    public void display() {
        System.out.println("Account Number: " + accno + ", Account Name: " + accname + ", Balance: " + balance);
    }
}

public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of accounts to create
        System.out.print("Enter the number of accounts: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create an array to hold Account objects
        Account[] accounts = new Account[n];

        // Accept account details from the user
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Account " + (i + 1) + ":");
            System.out.print("Account Number: ");
            int accno = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Account Name: ");
            String accname = scanner.nextLine();
            System.out.print("Balance: ");
            double balance = scanner.nextDouble();

            // Create an Account object and add it to the array
            accounts[i] = new Account(accno, accname, balance);
        }

        // Sort accounts by balance using the static method
        Account.sortAccount(accounts);

        // Display account details in sorted order
        System.out.println("\nAccounts sorted by balance:");
        for (Account account : accounts) {
            account.display();
        }

        // Close the scanner
        scanner.close();
    }
}
/*Enter the number of accounts: 3

Enter details for Account 1:
Account Number: 101
Account Name: SATISH
Balance: 10000

Enter details for Account 2:
Account Number: 102
Account Name: SANJYOT
Balance: 1000

Enter details for Account 3:
Account Number: 103
Account Name: TEJUU
Balance: 100000

Accounts sorted by balance:
Account Number: 102, Account Name: SANJYOT, Balance: 1000.0
Account Number: 101, Account Name: SATISH, Balance: 10000.0
Account Number: 103, Account Name: TEJUU, Balance: 100000.0*/
