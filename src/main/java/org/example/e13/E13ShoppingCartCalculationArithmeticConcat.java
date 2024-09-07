package org.example.e13;

public class E13ShoppingCartCalculationArithmeticConcat {
    public static void main(String[] args) {
        // Step 1: Declare the float variables and assign values
        float item1 = 30.0f;
        float item2 = 20.0f;
        float item3 = 40.0f;

        // Step 2: Calculate the total cost
float totalCost =item1+item2+item3;

        // Step 3: Apply the discount
      //  Create a float variable called `discountRate` an0% discountd set it to 0.1 (representing a 1).
     float discountRate =0.1f;


     //   - Calculate the discount amount by multiplying `totalCost` by `discountRate` and store the result in a variable called `discountAmount`.

       float discountAmount = totalCost * discountRate;

       // - Subtract the `discountAmount` from `totalCost` to get the final price and store it in a variable called `finalPrice`.
       float fnalPrice=  totalCost -discountAmount;
        // Step 4: Print the results
        System.out.println("Total Cost: " + "$" + totalCost);
        System.out.println("Discount Amount: " + "$" + discountAmount);
        System.out.println("Final Price: "+ "$" + fnalPrice);
    }
}
