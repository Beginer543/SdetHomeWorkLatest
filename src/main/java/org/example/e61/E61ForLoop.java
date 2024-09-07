package org.example.e61;

public class E61ForLoop {
    public static void main(String[] args) {
        // Use a for loop that starts with i = 1 and continues while i <= 10
        // Inside the loop, print the multiplication of 3 and i in the format "3*i=result"

        for (int i =1; i<=10; i++){
           int result=3 *i ;
            System.out.println("3*"+ i + "="+ result);
        }

    }
}
