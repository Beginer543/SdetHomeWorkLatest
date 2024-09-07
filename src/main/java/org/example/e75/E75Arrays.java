package org.example.e75;

public class E75Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        double[][] numbers = {
                {1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6}
        };

        // Use nested loops to iterate through the 2D array and print each value

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(numbers[i][j]);
            }
            System.out.println(" ");
}



    }
}
