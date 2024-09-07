# Exercise: Finding the Longest Word in a String Array

## Objective
Learn how to create a package-private method in Java that accepts a String array and returns the word with the largest length. If there are multiple words with the same largest length, the first one encountered should be returned. The method should only be accessible within the same package.

## Instructions

**Creating the maxLength Method**

In this project, you will create a package-private method that finds the word with the largest length in a given array of strings. The method should have package-private visibility, meaning it can only be accessed from within the same package.

### Steps for You to Do:

1. **Declare Method:**
    - Create a package-private method (no access modifier) with the following specifications:
        - **Returns:** a String
        - **Name:** `maxLength`
        - **Parameters:** a String array called `words`
        - **Purpose:** The method will return the first word with the largest length from the array.

2. **Method Logic:**
    - Inside the method, iterate through the array of words.
    - Keep track of the longest word found during the iteration.
    - If multiple words have the same length, return the first one encountered.

3. **Main Method:**
    - In the main method, create an array of words.
    - Call the `maxLength` method with the array of words and print the result.
    - Ensure that the method is called from within the same package to respect the package-private access modifier.

### Example InputOutput:

- Example input array:
  ```
  {"this", "is", "a", "long", "word"}
  ```

- Expected Output:
  ```
  this
  ```

- Example input array:
  ```
  {"java", "programming", "is", "fun"}
  ```

- Expected Output:
  ```
  programming
  ```

### Purpose:

- The `maxLength` method helps you practice basic string array manipulation and introduces the concept of package-private methods, which are only accessible within the same package.

## Tips:
- Ensure that the method is declared without an explicit access modifier to make it package-private.
- Use a simple loop to iterate through the array and find the first word with the largest length.

## Troubleshooting:
- If the method is not accessible from another class, verify that both the calling class and the method are within the same package.
- If the output doesn't match the expected result, ensure that the loop correctly tracks and returns the longest word encountered.

By completing this exercise, you will practice working with arrays and access modifiers in Java, specifically focusing on package-private visibility. Happy coding!
