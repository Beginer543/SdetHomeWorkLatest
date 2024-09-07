package org.example.e72;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Create an array of strings with size 7
        String[] daysOfWeek = new String[7];

        // Prompt the User for Input
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println("Please enter day " + (i + 1) + " of the week");
            daysOfWeek[i] = scanner.nextLine(); // Store each input in the array
        }

        // Print a blank line for better readability


        // Use another loop to iterate through the array and print each value on a new line
        for (String day : daysOfWeek) {
            System.out.println(day);
        }

        // Close the scanner to avoid resource leaks
        scanner.close();// Use a loop to prompt the user to input the days of the week one by one and store each input in the array

        // Use another loop to iterate through the array and print each value on a new line

        // Create a Scanner object to read input from the console



    }
}
