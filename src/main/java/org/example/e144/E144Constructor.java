package org.example.e144;

class Dog {
    // Step 1: Define instance variables
    private String dogName; // instance variable for dog name
    private double dogWeight; // instance variable for dog weight

    // Step 1: Define static variable for dog breed
    public static String dogBreed = "Mutt"; // static variable shared by all instances

    // Step 2: Constructor to initialize instance variables
    public Dog(String dogName, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }

    // Step 3: Method to display dog details
    public void displayDetails() {
        System.out.println(dogName + " " + dogBreed + " " + dogWeight);
    }
}



public class E144Constructor {
    public static void main(String[] args) {
        // Step 4: Create Dog objects
        Dog dog1 = new Dog("Tarzan", 50.0); // first dog
        Dog dog2 = new Dog("Lucy", 10.0);   // second dog

        // Step 4: Call displayDetails method to print details of each dog
        dog1.displayDetails(); // Output: Tarzan Mutt 50.0
        dog2.displayDetails(); // Output: Lucy Mutt 10.0
    }
}
