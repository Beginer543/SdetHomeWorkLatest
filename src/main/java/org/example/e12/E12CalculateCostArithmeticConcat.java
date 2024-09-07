package org.example.e12;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class E12CalculateCostArithmeticConcat {
    public static void main(String[] args) {
        // Declare the float variables and assign values
        float item1 = 15.5f;
        float item2 = 23.0f;
        float item3 = 9.99f;
        float item4 = 27.49f;

        // Calculate the total cost
   float totalCost = item1+item2+item3+item4;

        // Calculate the average cost

       float averageCost =totalCost / 4;


        // Print the results

      //System.out.println("The total cost is " + totalCost);
        //System.out.println("The average cost is " + averageCost);

        System.out.printf("The total cost is %.2f\n", totalCost);
        System.out.printf("The average cost is %.3f\n", averageCost);
    }
}
