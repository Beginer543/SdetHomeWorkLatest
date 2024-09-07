package org.example.e114;

public class E114JavaMethods {
    // Create Method multiply
    public static void multiply(int a, int b) {
        System.out.println("Multiplication " + (a * b));
    }

    // Create Method add
    public static void add(int a, int b) {
        System.out.println("Addition " + (a + b));
    }

    // Create Method subtract
    public static void subtract(int a, int b) {
        System.out.println("Subtraction " + (a - b));
    }

    // Main method
    public static void main(String[] args) {
        // Call Methods from main
        add(15, 15);         // Addition 30
        multiply(6, 5);       // Multiplication 30
        subtract(30, 10);     // Subtraction 20
    }
}