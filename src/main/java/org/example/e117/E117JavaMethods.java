package org.example.e117;

public class E117JavaMethods {
    public static void main(String[] args) {
        // Call the sumEvenToX method with various arguments to test the method
        int result1=sumEvenToX(5);
int result2= sumEvenToX(8);
        System.out.println("sumEvenToX(5) ==> " + result1);
        System.out.println("sumEvenToX(8) ==> " + result2);
    }
public static int sumEvenToX(int x) {
    // Create method sumEvenToX with an integer parameter (x)
    int sum = 0;
    // Inside the method, calculate the sum of even integers from 1 to x
    for (int i = 1; i <=x; i++) {
        if (i % 2 == 0) {
            sum += i;



        }

    }
    return sum;//Return the calculated sum
    }
}