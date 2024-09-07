package org.example.e15;

public class E15TimeConversionModulus {
    public static void main(String[] args) {
        // Declare the int variable and assign a value
int totalMinutes=125;


        // Calculate hours and minutes
int hours= totalMinutes/60;
int minutes = totalMinutes %60;


        // Print the results 125 minutes is equal to 2 hours and 5 minutes.
        System.out.println( "125 minutes is equal to " + hours + " hours" + " and " + minutes + " minutes.");
    }
}
