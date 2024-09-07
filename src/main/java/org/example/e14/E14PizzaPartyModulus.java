package org.example.e14;

public class E14PizzaPartyModulus {
    public static void main(String[] args) {
        // Declare the int variables and assign values
        int totalSlices=13;
        int frends=4;


        // Calculate slices per person

        int slicesPerPerson=totalSlices/frends;
int leftoverSlice =totalSlices % frends;
        // Print the results
        System.out.println("Each person gets "  + slicesPerPerson+ " slices.");
        System.out.println("There are " + leftoverSlice + " slices left over.");
    }
}
