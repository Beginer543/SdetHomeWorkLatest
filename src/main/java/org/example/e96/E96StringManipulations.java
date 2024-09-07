package org.example.e96;

import java.util.Scanner;

public class E96StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a programming language
        System.out.println("Please enter a programming language:");

        // Read the input string
        String input = scanner.nextLine();

        // Use conditional statements to print the description based on the input
        if ("Java".equalsIgnoreCase(input)) {
            System.out.println("Java is a programming language");
        } else if ("C".equalsIgnoreCase(input)) {
            System.out.println("C is a procedural programming language");
        } else if ("C++".equalsIgnoreCase(input)) {
            System.out.println("C++ is a middle-level programming language");
        } else {
            // For any other input, print "Doesn't match any programming language"
            System.out.println("Doesn't match any programming language");
        }

        // Close the scanner
        scanner.close();
    }
}