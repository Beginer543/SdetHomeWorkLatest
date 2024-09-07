# Exercise: Using Static Methods and Variables with Arrays

## Objective
Learn how to declare and use static methods and variables in Java, and apply them to modify elements of an integer array.

## Instructions

**Modifying Array Elements with Static Methods**

In this project, you will complete a static method that processes an integer array by modifying each element according to whether it is even or odd, while utilizing static variables and methods.

### Steps for You to Do:

1. **Declare Static Variables and Method:**
    - Declare a static method called `mystery` that takes an integer array as a parameter.
    - Inside the method, for each element in the array:
        - If the number is **even**, divide it by 2.
        - If the number is **odd**, multiply it by 10.

2. **Create a Static Method to Display Results:**
    - Create another static method to display the modified elements of the array in a formatted output.

3. **Main Method:**
    - Inside the main method, initialize an integer array.
    - Call the `mystery` method to modify the array.
    - Call the display method to print the modified array in the following format:
      ```
      10 1 30 2 50
      ```

### Example Output:
- **Input Array:** `[1, 2, 3, 4, 5]`
- **Output Array:** `10 1 30 2 50`

## Tips:
- Use a loop inside the static method to iterate through each element of the array and apply the modification.
- Make sure to declare both methods as static so that they can be called without creating an instance of the class.

## Troubleshooting:
- If your program doesn't compile, verify that all methods and variables are declared as static.
- If the output is incorrect, check the logic that modifies the array elements to ensure that even numbers are divided by 2 and odd numbers are multiplied by 10.

By completing this exercise, you will better understand how to work with static methods and variables while manipulating arrays in Java. Happy coding!
