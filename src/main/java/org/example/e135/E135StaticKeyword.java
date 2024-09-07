package org.example.e135;

public class E135StaticKeyword {
    public static void main(String[] args) {
        // Test the surround method
        System.out.println(surround("abcabcabc", "c")); // Expected: "ab(c)ab(c)ab(c)"
        System.out.println(surround("technology", "o")); // Expected: "techn(o)l(o)gy"
    }

    public static String surround(String s, String search_term) {
        // Ensure the search_term is a single character
        if (search_term.length() != 1) {
            throw new IllegalArgumentException("search_term should be a single character");
        }

        char term = search_term.charAt(0);
        StringBuilder result = new StringBuilder();

        // Iterate through the string and build the result
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == term) {
                result.append('(').append(term).append(')');
            } else {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}