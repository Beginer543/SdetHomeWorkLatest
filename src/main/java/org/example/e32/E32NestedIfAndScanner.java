package org.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        char gender = scanner.next().charAt(0);

        // Print prompt for user to enter gender
        // Capture the gender input
        System.out.println("Please enter your age");
        // Print prompt for user to enter age
        int age = scanner.nextInt();
        // Capture the age input
        if (age > 25)
            if (gender == 'F') {
                System.out.println("Woman");
            } else {
                System.out.println("Man");
            }
        else if (age <= 25) {
            if (gender == 'F') {
                System.out.println("Girl");
            } else {
                System.out.println("Boy");
            }
        }
        // Classify based on gender and age


        // Create a Scanner object to read input from the console

    }

    }


