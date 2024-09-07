package org.example.e65;

import java.util.Scanner;

public class E65ForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console

        Scanner scanner = new Scanner(System.in);
        System.out.print("In: ");
        // Prompt the user to enter a value for x
        int x = scanner.nextInt();
        // Use a for loop that starts with i = x - 1 and continues while i >= 0
        // Inside the loop, print the value of i followed by a space

      int i = x - 1;
      while (i >= 0) {
          System.out.print(i + " ");
          i--;
            }
        System.out.println();


        System.out.print("In: ");
        int y = scanner.nextInt();
        int k =  y- 1;
        while (k >= 0) {
            System.out.print(k + " ");
            k--;
        }
        System.out.println();


        System.out.print("In: ");
        int g = scanner.nextInt();
       int n = g - 1;
        while (n >= 0) {
            System.out.print(n + " ");
            n--;
        }
        System.out.println();

scanner.close();
        }



    }


