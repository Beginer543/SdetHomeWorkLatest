package org.example.e118;

public class E118JavaMethods {

    public static void main(String[] args) {
        // Students will write the code here.

        System.out.println(spaceOut("hello"));
        System.out.println(spaceOut("technology"));
    }
    public static String spaceOut(String s) {
        // Create a StringBuilder to efficiently build the new string
        StringBuilder spacedString = new StringBuilder();

        // Loop through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            // Append the character followed by a space
            spacedString.append(s.charAt(i)).append(" ");
        }

        // Convert the StringBuilder to a String and return it
        return spacedString.toString();

    }
}