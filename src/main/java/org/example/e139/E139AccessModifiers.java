package org.example.e139;

public class E139AccessModifiers {

    public static String alphabetical(String str) {
        // Initialize an empty StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Add the first character to the result
        result.append(str.charAt(0));

        // Iterate through the string starting from the second character
        for (int i = 1; i < str.length(); i++) {
            // Compare the current character with the previous one
            if (str.charAt(i) > str.charAt(i - 1)) {
                // If the current character is later in the alphabet, add it to the result
                result.append(str.charAt(i));
            }
        }

        // Return the resulting string
        return result.toString();
    }

    public static void main(String[] args) {
        // Test the alphabetical method
        System.out.println(alphabetical("hello"));    // Expected output: "hlo"
        System.out.println(alphabetical("software")); // Expected output: "stwr"
        System.out.println(alphabetical("language")); // Expected output: "lnug"
    }
}