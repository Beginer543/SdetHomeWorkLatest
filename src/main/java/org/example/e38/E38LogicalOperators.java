package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner= new Scanner(System.in);
        // Print prompt for user to answer if it is the weekend
        // Capture the weekend input
        System.out.println("Is it weekend? (true/false)");
        boolean isWeekend=scanner.nextBoolean();
        System.out.println("Are you available? (true/false)");
        boolean isAvailable=scanner.nextBoolean();
        // Determine the subject based on the input
        String subject;
        // If it is the weekend
        if (isWeekend && isAvailable){
            subject="Java";

        }else if(!isWeekend && isAvailable){
            subject="manual testing";
        }else {
            subject="no subject";
        }

        System.out.println("Today you will be learning "+ subject);
        //    Set subject to "Java"
        // Otherwise
        //    Set subject to "manual testing"

        // Print the subject suggestion
        // Output: Today you will be learning ____


    }
}
