# Exercise: Extracting Every Third Letter with Static Methods

## Objective
Learn how to create and use static methods in Java to manipulate strings and extract specific characters.

## Instructions

**Extracting Every Third Letter with a Static Method**

In this project, you will create a static method that processes a string and returns every third letter, starting from the first letter.

### Steps for You to Do:

1. **Declare Static Method:**
    - Create a static method called `thirdLetter` that:
        - **Returns:** a `String`
        - **Parameters:** a `String` called `s`
    - Inside the method, implement logic to return every third letter of the string `s`, starting from the first letter.

2. **Main Method:**
    - Inside the main method, call the `thirdLetter` method with different string inputs and print the results.

### Example InputOutput:

- **Input:** `"hello there"`
- **Output:** `"hltr"`

- **Input:** `"technology"`
- **Output:** `"thly"`

### Example Behavior:

- The method should process the string `s` and return a new string consisting of every third letter. For example, with the input `"hello there"`, the method would return `"hltr"` by selecting the first, fourth, seventh, and tenth characters.

## Tips:
- Use a loop inside the static method to iterate through the string, selecting every third letter.
- Make sure that the method is declared as static so it can be called directly from the main method.

## Troubleshooting:
- If the program doesn't return the expected output, verify that the loop correctly skips two letters before selecting the third letter.
- Ensure that the string is not empty and has sufficient characters to extract every third letter.

By completing this exercise, you will understand how to manipulate strings using static methods in Java. Happy coding!
