package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner inp = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.println("In:");
        String word = inp.nextLine();
        // Use a for loop to iterate through the string and print only the vowels
        // (Your code goes here)

        for (int i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);
            if (ch=='a'|| ch=='e' ||ch=='i'|| ch=='o'|| ch=='u'){
                System.out.print(ch);
            }
        }
        System.out.println();
        inp.close();
    }
}
