# Exercise: Surrounding Instances of a Search Term with Parentheses Using Static Methods

## Objective
Learn how to create a static method in Java that surrounds every instance of a search term within a string with parentheses.

## Instructions

**Surrounding Search Term with Parentheses Using a Static Method**

In this project, you will create a static method that takes a string and a search term, and returns a new string where every instance of the search term is surrounded by parentheses.

### Steps for You to Do:

1. **Declare Static Method:**
    - Create a static method called `surround` that:
        - **Returns:** a String
        - **Takes:**
            - a String called `s`
            - a String called `search_term`
    - Inside the method, write logic to return a new string where every instance of the `search_term` in `s` is surrounded by parentheses.

2. **Main Method:**
    - Inside the main method, call the `surround` method with different string inputs and print the results.

### Example InputOutput:

- `surround("abcabcabc", "c")` ==> "ab(c)ab(c)ab(c)"
- `surround("technology", "o")` ==> "techn(o)l(o)gy"

### Purpose:

- The `surround` method will search for every occurrence of the `search_term` in the string `s`, and surround it with parentheses.

## Tips:
- Use the String class's replace method or other string manipulation techniques to replace each instance of the search term with the search term surrounded by parentheses.

## Troubleshooting:
- If the output doesn't match the expected result, ensure that you correctly replace each instance of the search term with the surrounded version.
- Make sure the method is returning the new string with all occurrences of the search term modified.

By completing this exercise, you will improve your understanding of string manipulation using static methods in Java. Happy coding!
