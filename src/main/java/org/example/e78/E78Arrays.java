package org.example.e78;

public class E78Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum=0;//variable to store the sum all array
        for (int i = 0; i < a.length; i++) {//return the row
            for (int j = 0; j < a[i].length; j++) //return col
            {
         sum+=a[i][j];//sum of the all elements
            }

        }
        // Use nested loops to iterate through the 2D array and calculate the sum of all elements
      //  System.out.println(a);
        System.out.println(sum);

        // Print the calculated sum
    }
}
