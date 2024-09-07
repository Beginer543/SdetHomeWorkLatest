package org.example.e140;

public class E140AccessModifiers {

    // Method with default access modifier (visible within the same package)
    static String maxLength(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }

        String maxLengthWord = words[0];

        for (String word : words) {
            if (word.length() > maxLengthWord.length()) {
                maxLengthWord = word;
            }
        }

        return maxLengthWord;
    }

    public static void main(String[] args) {
        String[] words = {"this", "is", "long"};
        String longestWord = maxLength(words);

        // Print the entire array followed by the longest word in the required format
        System.out.println(
                String.join(" ", words));
    }

}
