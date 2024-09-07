package org.example.e145;

public class E145ThisKeyword {
    private String dogName;          // Instance variable for the dog's name
    private double dogWeight;        // Instance variable for the dog's weight
    private static String dogBreed = "Mutt";  // Static variable for the breed

    // Constructor to initialize the dog's name and weight
    public E145ThisKeyword(String dogName, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }

    // Method to display the dog's details
    public void displayDetails() {
        System.out.println(dogName + " " + dogBreed + " " + dogWeight);
    }

    public static void main(String[] args) {
        // Creating two Dog objects with different names and weights
        E145ThisKeyword dog1 = new E145ThisKeyword("Tarzan", 50.0);
        dog1.displayDetails();  // Output: Tarzan Mutt 50.0

        E145ThisKeyword dog2 = new E145ThisKeyword("Lucy", 10.0);
        dog2.displayDetails();  // Output: Lucky Mutt 10.0
    }
}
