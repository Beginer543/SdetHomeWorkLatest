package org.example.e141;

public class E141AccessModifiers {

    // Method to find the maximum value in an int array
    public static int maxValue(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Test the maxValue method
        int[] numbers = {10, 22, 5, 8, 15};
        int max = maxValue(numbers);
        System.out.println(max); // Output should be 22
    }
}