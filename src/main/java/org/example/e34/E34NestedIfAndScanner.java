package org.example.e34;

import java.util.Scanner;

public class E34NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers separated by spaces");
        // Print prompt for user to enter 3 distinct numbers separated by spaces

        // Capture the three numbers input
      double num1= scanner.nextDouble();
        double num2= scanner.nextDouble();
        double num3= scanner.nextDouble();

        //Find the largest Number
       double largest;
        if (num1> num2){
            if (num1>num3){
                largest=num1;
            }else {
                largest=num3;

            }
        }else {
            if (num2>num3){
                largest=num2;
            }else {largest=num3;
            }
        }
        System.out.println("The largest number is "+ largest);
        // Use nested if-else statements to find the largest number

scanner.close();

    }
}
