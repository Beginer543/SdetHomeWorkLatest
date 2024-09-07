package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        //write code from here
        for (int i = 0; i < arr.length; i++) {
            arr[i]= input.nextLine();
        }
        System.out.println("In:");
        for (String name:arr){
            if (name.length()>=3){
                System.out.println(name.substring(0,3));
            }else {
                System.out.println(name);
            }
        }
        input.close();
    }
}


