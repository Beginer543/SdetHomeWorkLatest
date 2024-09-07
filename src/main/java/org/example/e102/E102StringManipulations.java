package org.example.e102;

import java.util.Scanner;

public class E102StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("In:");
        String input = scanner.nextLine();

        // Print each character on a separate line
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }


    }
}