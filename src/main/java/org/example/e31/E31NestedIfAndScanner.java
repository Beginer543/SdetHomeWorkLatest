package org.example.e31;

import java.util.Scanner;

public class E31NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Declare a boolean variable isSunny
        System.out.println("Is it sunny outside? (true/false)");
        boolean isSunny = scanner.nextBoolean();
        // Print "Is it sunny outside? (true/false)"

        // Capture the user's input and store it in isSunny
        if(isSunny) {
            System.out.println("It is a sunny day, I should go somewhere!");

            System.out.println("What is the temperature outside?");

            // Declare an integer variable temperature
            int temperature = scanner.nextInt();

            // Use an if-else statement to check if it is sunny


            if (temperature > 85) {
                System.out.println("I am going to the beach!");
            } else {
                System.out.println("I am going to the park!");
            }
        }else {
                System.out.println("I stay home and practice Java");
            }
        scanner.close();
        }

    }

