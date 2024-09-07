# Exercise: Modifying Elements in a 2D Array with Static Methods

## Objective
Learn how to create and use static methods in Java to manipulate elements of a 2D array.

## Instructions

**Reducing Elements in a 2D Array with a Static Method**

In this project, you will complete a static method that subtracts 10 from each element of a 2D array of doubles and returns a new array with the modified values.

### Steps for You to Do:

1. **Declare Static Method:**
    - Create a static method called `reduce10` that:
        - **Takes:** a 2D array of doubles called `nums`
        - **Returns:** a new 2D array of doubles with each element reduced by 10.

2. **Main Method:**
    - Inside the main method, initialize a 2D array of doubles.
    - Call the `reduce10` method with the 2D array as input.
    - Print the values from the new array in the following format:
      ```
      -9 -8 -7 -6
      -6 -5 -4 -3
      -9 -7 -5 -3
      ```

### Example InputOutput:

- **Input Array:**
  ```
  1 2 3 4
  4 5 6 7
  1 3 5 7
  ```

- **Output Array:**
  ```
  -9 -8 -7 -6
  -6 -5 -4 -3
  -9 -7 -5 -3
  ```

### Example Behavior:

- The `reduce10` method should loop through each element of the 2D array `nums`, subtract 10 from each value, and store the result in a new 2D array. This new array is then returned and printed in the format shown above.

## Tips:
- Use nested loops inside the static method to access each element of the 2D array.
- Ensure that the method returns a new array instead of modifying the original one.

## Troubleshooting:
- If the output doesn't match the expected result, check the logic in the loops to ensure that 10 is subtracted from every element correctly.
- Ensure that the dimensions of the new 2D array match those of the original array.

By completing this exercise, you will gain a better understanding of how to manipulate 2D arrays using static methods in Java. Happy coding!
