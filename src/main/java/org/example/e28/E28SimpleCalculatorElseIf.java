package org.example.e28;

public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {
        // Declare a variable for operator and assign a value
char operator= '*';

        // Declare two variables for numbers and assign values
       int num1=10;
       int num2=5;

        // Perform the corresponding arithmetic operation
        int result=0;
        if (operator=='+'){

           result =num1+num2;
            System.out.println("The sum is:"+ result + ".");
        } else if (operator== '-') {
            result=num1-num2;
            System.out.println("The difference is: "+ result+".");
        } else if (operator=='*') {
            result=num1*num2;
            System.out.println("The product is: "+  result);

        } else if (operator=='/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("The quotient is: " + result+".");
            } else {
                System.out.println("Error: Division by zero is not allowed.");

            }
        }else {
            System.out.println("Invalid operator");
        }
    }
}
