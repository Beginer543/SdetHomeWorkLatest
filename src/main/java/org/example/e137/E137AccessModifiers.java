package org.example.e137;

public class E137AccessModifiers {
    private static String name;
    private static String city;
    private static String school;
    private static int batchNum;

    public static void main(String[] args) {
//My name is John and I live in Miami. I study at Syntax in batch 9
        name="John";
        city="Miami";
        school="Syntax";
        batchNum=9;

        display();
    }
public static void display(){
    System.out.println("My name is "+ name+" and I live in "+ city+". "+"I study at "+school+ " in batch "+batchNum );
}

    }


