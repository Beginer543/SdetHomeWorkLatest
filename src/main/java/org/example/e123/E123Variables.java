package org.example.e123;

public class E123Variables {
    // Declare instance variables to hold integer, String, double, boolean, and float values
int myInt;
    String myString;
double myDouble;
boolean myBoolean;
float myFloat;
void printDefaultValues(){
    System.out.println(myInt);
    System.out.println(myString);
    System.out.println(myBoolean);
    System.out.println(myFloat);
}

    public static void main(String[] args) {
        // Create an instance of the class
        E123Variables instanceValue=new E123Variables();
        // Access instance variables and print them without assigning any values
instanceValue.printDefaultValues();
        // Print the default values of the instance variables

    }
}
