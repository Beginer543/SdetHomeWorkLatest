package org.example.e103;

import java.util.Scanner;

public class E103StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner inp = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.print("In:\n");  // Print "In:" and move to the next line
        String s = inp.nextLine();
        // Iterate through the string and print each character separated by spaces
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                System.out.print(s.charAt(i)); // Print the last character without a trailing space
            } else {
                System.out.print(s.charAt(i) + " ");
                if (i < s.length() - 1) {
                    System.out.print("");
                }
            }

            // Close the scanner
            inp.close();

        }
        System.out.println();

    }
}
