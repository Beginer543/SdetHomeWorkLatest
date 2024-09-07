package org.example.e42;

import java.util.Scanner;

public class E42SwitchClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)");
        int dayOfWeek = scanner.nextInt();

        switch (dayOfWeek) {
            case 1:
                System.out.println("Activity: Go to the gym");
                break;
            case 2:
                System.out.println("Activity: Attend a coding meetup");
                break;
            case 3:
                System.out.println("Activity: Go for a mid-week run");
                break;
            case 4:
                System.out.println("Activity: Take a cooking class");
                break;
            case 5:
                System.out.println("Activity: Movie night");
                break;
            case 6:
                System.out.println("Activity: Family day");
                break;
            case 7:
                System.out.println("Activity: Relax and recharge");
                break;
            default:
                System.out.println("Invalid day entered");
                break;
        }
    }}