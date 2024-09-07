# Exercise: Finding the Maximum Value in an Integer Array

## Objective
Learn how to create a `public` method in Java that accepts an integer array and returns the maximum value. This method should be accessible from any class in any package.

## Instructions

**Creating the maxValue Method**

In this project, you will create a method that finds the maximum value in a given integer array. The method should have `public` visibility, meaning it can be accessed from any class in any package.

### Steps for You to Do:

1. **Declare Method with Public Access Modifier:**
    - Create a method with the following specifications:
        - **Returns:** an integer
        - **Name:** `maxValue`
        - **Parameters:** an integer array called `nums`
        - **Purpose:** The method will return the maximum value found in the array.

2. **Method Logic:**
    - Inside the method, iterate through the array of integers.
    - Keep track of the maximum value found during the iteration.
    - Return the maximum value after iterating through the array.

3. **Main Method:**
    - In the main method, create an integer array.
    - Call the `maxValue` method with the array and print the result.
    - Ensure the method is declared as `public` so that it is accessible from other classes and packages.

### Example InputOutput:

- Example input array:
  ```
  {1, 5, 22, 3, 7}
  ```

- Expected Output:
  ```
  22
  ```

### Purpose:

- The `maxValue` method helps you practice basic array manipulation and introduces the concept of the `public` access modifier, which allows a method to be accessible across the entire project, including from other packages.

## Tips:
- Ensure that the method is declared as `public` so it is accessible from any other class or package.
- Use a simple loop to iterate through the array and find the maximum value.

## Troubleshooting:
- If the output doesn't match the expected result, ensure that the loop correctly tracks the maximum value and returns it.
- If you cannot access the method from another class, verify that it is declared as `public`.

By completing this exercise, you will practice both basic array manipulation and how to use the `public` access modifier to make methods accessible throughout a project. Happy coding!
