package org.example.e81;

public class E81Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
int sum=0;
        // Use nested loops to iterate through the 2D array and sum the elements that are on even indexes and even rows
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a[i].length; j++) {
                    if (j % 2 == 0) {
                        sum += a[i][j];
                    }
                }
            }

        }
        System.out.println(sum);
    }


    // Print the calculated sum
    }
