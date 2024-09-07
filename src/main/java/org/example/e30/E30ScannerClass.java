package org.example.e30;

import java.util.Scanner;

public class E30ScannerClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
Scanner scanner  =new Scanner(System.in);

        // Print prompt for user to input the month number

        // Capture the month number

        System.out.println("Please enter the month number");
int monthNumber=scanner.nextInt();

        // Check the value of monthNumber and identify the month
        // If the value is between 1 and 12, print the corresponding month name

        String monthName;
        if (monthNumber==1){
            monthName="January";
        } else if (monthNumber==2) {
            monthName="February";
        } else if (monthNumber==3) {
            monthName="March";
        } else if (monthNumber==3) {
            monthName="Aprial";

        } else if (monthNumber==4) {
            monthName="May";

        } else if (monthNumber==5) {
            monthName="June";

        } else if (monthNumber==6) {
            monthName="July";

        } else if (monthNumber==7) {
            monthName="August";

        } else if (monthNumber==8) {
            monthName="August";

        } else if (monthNumber==9) {
            monthName="September";

        } else if (monthNumber==10) {
            monthName="Octovber";


        } else if (monthNumber==11) {
            monthName="November";

        } else if (monthNumber==12) {
            monthName="December";

        }else {
            monthName="Invalid";
        }


        // If the value is out of range, print "Invalid"

        System.out.println(monthName);
scanner.close();

    }
}
