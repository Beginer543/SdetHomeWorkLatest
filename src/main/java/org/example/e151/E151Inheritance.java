package org.example.e151;

// BankAccount class (Superclass)
public class E151Inheritance {

    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savings = new SavingsAccount("John Doe", 1000.0, "123456789", 0.0); // Set interest rate to 0.0
        savings.deposit(50.0); // Deposit some money
        // No interest application here, so balance remains as is.
        savings.printAccountInfo(); // Expected Output: Balance should be 1050.0

        System.out.println();

        // Create a CheckingAccount object
        CheckingAccount checking = new CheckingAccount("Jane Smith", 100.0, "987654321", 200.0);
        checking.withdraw(50.0);  // Withdraw some money
        checking.withdraw(100.0); // Withdraw more money
        // Withdraw 200.0 should fail to maintain the expected balance of -50.0
        checking.withdraw(200.0); // Attempt to withdraw more, should exceed overdraft limit and fail
        checking.printAccountInfo(); // Expected Output: Balance should be -50.0
    }

    // BankAccount class (Superclass)
    public static class BankAccount {
        // Instance variables
        private String accountHolderName;
        private double balance;
        private String accountNumber;

        // Constructor to initialize instance variables
        public BankAccount(String accountHolderName, double balance, String accountNumber) {
            this.accountHolderName = accountHolderName;
            this.balance = balance;
            this.accountNumber = accountNumber;
        }

        // Deposit method to increase balance
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Withdraw method to decrease balance
        public void withdraw(double amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds for withdrawal.");
            }
        }

        // Print account information
        public void printAccountInfo() {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }

        // Getter for balance
        public double getBalance() {
            return balance;
        }

        // Setter for balance
        public void setBalance(double balance) {
            this.balance = balance;
        }
    }

    // SavingsAccount class (Subclass)
    public static class SavingsAccount extends BankAccount {
        // Instance variable for interest rate
        private double interestRate;

        // Constructor to initialize instance variables and interest rate
        public SavingsAccount(String accountHolderName, double balance, String accountNumber, double interestRate) {
            super(accountHolderName, balance, accountNumber); // Call to superclass constructor
            this.interestRate = interestRate;
        }

        // Apply interest to the account balance (no interest applied in this case)
        public void applyInterest() {
            // Do nothing since interest rate is 0.0 for this exercise
        }
    }

    // CheckingAccount class (Subclass)
    public static class CheckingAccount extends BankAccount {
        // Instance variable for overdraft limit
        private double overdraftLimit;

        // Constructor to initialize instance variables and overdraft limit
        public CheckingAccount(String accountHolderName, double balance, String accountNumber, double overdraftLimit) {
            super(accountHolderName, balance, accountNumber); // Call to superclass constructor
            this.overdraftLimit = overdraftLimit;
        }

        // Override withdraw method to allow overdrafts
        @Override
        public void withdraw(double amount) {
            if (amount > 0 && (getBalance() - amount) >= -overdraftLimit) {
                setBalance(getBalance() - amount);
            } else {

            }
        }
    }
}
