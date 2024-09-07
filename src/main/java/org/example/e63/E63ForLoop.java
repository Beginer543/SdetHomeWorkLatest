package org.example.e63;

import java.util.Scanner;

public class E63ForLoop { public static void main(String[] args) {
        // Create a Scanner object to read input from the console
Scanner scanner=new Scanner(System.in);

        System.out.print("In: ");
        // Prompt the user to enter a value for x
        int x =scanner.nextInt();

        for (int i = 0; i < x; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(i);
        }
    }
}
