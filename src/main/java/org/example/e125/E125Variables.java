package org.example.e125;

public class E125Variables {
    // Declare a static variable at the class level to hold an integer value
    static int number;

    public static void main(String[] args) {
        // Access the static variable in the main method and assign a value to it
number=200;
        // Create an object of the class
        E125Variables obj= new E125Variables();
        // Access the static variable in a non-static way using the object and assign a value of 200
obj.number=200;
        // Print the static variable using the class name
        System.out.println(E125Variables.number);
        // Print the static variable using the object instance
        System.out.println(obj.number);
    }
}
