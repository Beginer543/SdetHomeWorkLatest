package org.example.e121;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char
int intValue;
double doubleValue;
char charValue;


    public static void main(String[] args) {
        // Create 2 instances of the class
        E121Variables firstInstance=new E121Variables();
        // Assign values to variables for the first instance
        // Print values of the first instance
firstInstance.intValue=10;
firstInstance.doubleValue =10.23;
firstInstance.charValue='a';
        System.out.println(firstInstance.intValue);
        System.out.println(firstInstance.doubleValue);
        System.out.println(firstInstance.charValue);

        E121Variables secondInstance=new E121Variables();
        // Assign values to variables for the second instance
        // Print values of the second instance
        secondInstance.intValue=100;
      secondInstance.doubleValue=100.23;
       secondInstance.charValue='s';
        System.out.println(secondInstance.intValue);
        System.out.println(secondInstance.doubleValue);
        System.out.println(secondInstance.charValue);

    }
}
