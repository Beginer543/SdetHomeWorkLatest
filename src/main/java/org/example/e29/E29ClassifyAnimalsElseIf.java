package org.example.e29;

public class E29ClassifyAnimalsElseIf {
    public static void main(String[] args) {
        // Declare a string variable and assign a value
String animal="dog";

        // Use if-else-if conditions to classify the animal
        if (animal.equals("dog"))
            System.out.println("The animal is a mammal.");
        if (animal.equals("eagle"))
            System.out.println("The animal is a bird.");
        if (animal.equals("shark"))
            System.out.println("The animal is a fish.");
        if (animal.equals("frog"))
            System.out.println("The animal is an amphibian.");
        if (animal.equals("The animal is a reptile."))
            if (animal.equals(animal))
                System.out.println("Unknown animal type.");
    }
}