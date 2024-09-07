package org.example.e35;

import java.util.Scanner;

import static java.lang.System.in;

public class E35LogicalOperators {
    public static <Scaner> void main(String[] args) {
        // Create a Scanner object to read input
Scanner scanner= new Scanner(System.in);
        // Print prompt for user to answer if they need a loan
        // Capture the loan requirement input
        System.out.println("Do you need a loan? (true/false)");
        // Check if the user needs a loan
boolean needsLoan= scanner.nextBoolean();
        // Step 1: Create a Scanner Object
       String eligibility;
if (needsLoan){
    System.out.println("What is your credit score?");
    int creditScore=scanner.nextInt();
    if (creditScore<600){
        eligibility="Not eligible";
    } else if (creditScore >= 600 && creditScore >=700) {
        eligibility="Maybe eligible";
    }else if (creditScore >=701 && creditScore <=800){
        eligibility="Eligible";
    }else {
        eligibility = "Definitely eligible";


    }
    }else{
        eligibility="Unknown";
    }
        System.out.println("The eligibility is "+ eligibility);
    }


    }



