package org.example.e98;

public class E98StringManipulations {
    public static void main(String[] args) {
        // Create a String variable named 'given' and assign the value "Hello Syntax friends" to it
        String given = "Hello Syntax friends";
        // Manipulate the string to create a new string "Welcome Syntax family"
        String extractedPart = given.substring(6, 12);
        String newString = "Welcome ".concat(extractedPart).concat(" family");
        // Print the new string
        System.out.println(newString);
    }
}
