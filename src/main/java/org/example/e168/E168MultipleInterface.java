package org.example.e168;

interface Transaction {
    void processTransaction(String message, double amount);
}

interface BankOperations extends Transaction {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}

class BankAccount implements BankOperations {
    private double balance;


    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        processTransaction("Deposited", amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            processTransaction("Withdrew", amount);

        } else {
            System.out.println("Transaction failed: Insufficient funds");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);

    }

    @Override
    public void processTransaction(String message, double amount) {
        System.out.println("Transaction successful: " + message + " " + amount);

    }
}

public class E168MultipleInterface {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(50.0);
        bankAccount.deposit(100.0);

        bankAccount.withdraw(50.0);

        bankAccount.checkBalance();
        bankAccount.withdraw(100.0);

    }
}
