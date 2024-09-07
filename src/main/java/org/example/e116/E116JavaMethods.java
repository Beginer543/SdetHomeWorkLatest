package org.example.e116;

public class E116JavaMethods {
    public static void main(String[] args) {
        // Call the bothEven method with various arguments to test the method
       boolean result=bothEven(4,7);
        System.out.println(result);
    }
    // Create method bothEven with two integer parameters
public static boolean bothEven (int n1, int n2){
    // Inside the method, check if both numbers are even
        if (n1 % 2 == 0 && n2%2==0) {
            return true;
        } else {
            return false;
            // Return true if both numbers are even, otherwise return false
        }
    }
}