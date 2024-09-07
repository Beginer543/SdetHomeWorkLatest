package org.example.e119;

public class E119JavaMethods {
    public static void main(String[] args) {
        // Students will write the code here.

        System.out.println(censorLetter("computer science", 'e'));
        System.out.println(censorLetter("trick or treat", 't'));
    }

    public static String censorLetter(String s, char c) {
        StringBuilder censoredString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                censoredString.append('*');
            }else {
                censoredString.append(s.charAt(i));
            }

        }
        return censoredString.toString();
    }

}