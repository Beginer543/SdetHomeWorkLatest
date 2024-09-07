package org.example.e95;

import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a string value
        System.out.print("Please enter a word: ");  // Prompt the user

        // Read the input string
        String str = scanner.nextLine();

        if (str.length() >= 3) {
            // Extract the first 3 letters using the substring() method
            String firstThreeLetters = str.substring(0, 3);
            // Print the result in the required format
            System.out.println("The first 3 letters of " + str + " is " + firstThreeLetters);
        } else {
            // Handle case where the string has less than 3 characters
            System.out.println("The first 3 letters of " + str + " is " + str);
        }

        // Close the scanner
        scanner.close();
    }
}