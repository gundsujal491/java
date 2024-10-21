package Slip10;


public class Q2 {
    private double balance; // Account balance

    // Constructor
    public Q2(String ignoredAcno, String ignoredName, double balance) {
        // Account number
        // Account holder's name
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientFundException {
        if (amount > balance - 500) {
            throw new InsufficientFundException("Insufficient funds for withdrawal. Minimum balance must be maintained.");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Method to view balance
    public double viewBalance() {
        return balance;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Q2 account = new Q2("123456", "John Doe", 1000);

        try {
            System.out.println("Current Balance: " + account.viewBalance());
            account.deposit(200);
            System.out.println("Current Balance after deposit: " + account.viewBalance());

            account.withdraw(600); // This should succeed
            System.out.println("Current Balance after withdrawal: " + account.viewBalance());

            account.withdraw(700); // This should throw InsufficientFundException
            System.out.println("Current Balance after withdrawal: " + account.viewBalance());
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}

