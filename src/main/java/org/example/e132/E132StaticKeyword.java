package org.example.e132;

public class E132StaticKeyword {

    // Static method to subtract 10 from every element of the 2D array
    public static double[][] reduce10(double[][] nums) {
        double[][] result = new double[nums.length][nums[0].length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                result[i][j] = nums[i][j] - 10;
            }
        }
        return result;  // Return result array after processing
    }

    public static void main(String[] args) {
        // Define the input 2D array
        double[][] nums = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };

        // Call the reduce10 method and get the new 2D array
        double[][] reducedNums = reduce10(nums);

        // Print the values from the new array
        for (int i = 0; i < reducedNums.length; i++) {
            for (int j = 0; j < reducedNums[i].length; j++) {
                System.out.print((int) reducedNums[i][j] + " ");
            }
            System.out.println();
        }
    }
}