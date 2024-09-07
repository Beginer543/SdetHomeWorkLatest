package org.example.e76;

public class E76Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        double[][] a = {
                {1.4, 2.0, 3.3, 2},
                {4, 1.5, 6.1, 1},
                {1.2, 3.1, 4, 1.6}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                a[i][j]*=2;// Double each value

            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
        // Use nested loops to iterate through the 2D array and double the value of each element
        // Use nested loops to iterate through the 2D array and print each value
    }
}
