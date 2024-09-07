package org.example.e40;

import java.util.Scanner;

public class E40SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner=new Scanner(System.in);
        // Print prompt for user to enter the name of the instructor
        // Capture the instructor name input
        System.out.println("Enter name of the instructor");
        String instructorName=scanner.nextLine().trim();
        String responsibilit;
        // Determine the responsibility based on the instructor's name using a switch statement
switch (instructorName){
    case "Asghar":
        responsibilit="Will take care of Java Assignment";
        break;
    case "Moazzam":
        responsibilit="Will take care of SDLC Assignment";
        break;
    case "Weqas":
        responsibilit="Will take care of Selenium Assignment";
        break;
    case "Asel":
        responsibilit="Will take care of every Assignment";
        break;
    default:
        responsibilit="Invalid instructor selected";
}
        System.out.println(responsibilit);
scanner.close();





        // Print the responsibility


    }
}
