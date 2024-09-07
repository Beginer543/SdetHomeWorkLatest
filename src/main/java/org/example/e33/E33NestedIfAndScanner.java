package org.example.e33;

import java.util.Scanner;

public class E33NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input

        Scanner scanner = new Scanner(System.in);

        // Print "Please enter a number"
        System.out.println("Please enter a number");

        // Capture the user's input using the Scanner object and store it in a variable called number
        int number = scanner.nextInt();

        // Classify the number
        if (number % 2 == 0) {
            // If the number is even
            System.out.println("Value is even");

            if (number > 1000) {
                System.out.println("Even value is large");
            } else {
                System.out.println("Even value is just right");
            }
        } else {
            // If the number is odd
            System.out.println("Value is odd");

            if (number > 1000) {
                System.out.println("Odd value is large");
            } else {
                System.out.println("Odd value is just right");
            }
        }

        // Close the scanner
        scanner.close();
    }
}



