package org.example.e160;

import org.example.e151.E151Inheritance;

class BankAccount {
    private void displayInfo() {
        System.out.println("private displayInfo method");
    }

    private void displayInfo(int balance) {
        System.out.println("private displayInfo method with balance: " + balance);
    }
    static void displayBankInfo() {
        System.out.println("static method without parameter");
    }

    static void displayBankInfo(int branches) {
        System.out.println("static method with int parameter: " + branches);
    }
    public void performInstanceMethods() {
        displayInfo();
        displayInfo(5000);
    }
}

public class E160MethodOverloading {
    public static void main(String[] args) {
        // Create an object of BankAccount to access instance methods
        BankAccount b = new BankAccount();

        // Call the public method that invokes private instance methods
        b.performInstanceMethods();  // Calls displayInfo methods

        // Call static methods using the class name
        BankAccount.displayBankInfo();         // Calls the static method without parameters
        BankAccount.displayBankInfo(20);       // Calls the static method with the number of branches
    }
}