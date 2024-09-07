package org.example.e70;

public class E70Arrays {
    public static void main(String[] args) {
        int[] years = new int[11];

        // Add the Years to the Array Using a For Loop
        for (int i = 0; i < years.length; i++) {
            years[i] = 2010 + i; // Populate the array with years from 2010 to 2020
        }

        // Print the Array Values
        for (int year : years) {
            System.out.println(year);
        }
}

}
