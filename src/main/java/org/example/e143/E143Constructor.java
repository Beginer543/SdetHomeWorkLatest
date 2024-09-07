package org.example.e143;

public class E143Constructor {
    private String make;
    private String model;
    private int numberOfDoors;
    private int topSpeed;
    private double price;

    // First constructor: all parameters
    public E143Constructor(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    // Second constructor: all parameters except numberOfDoors
    public E143Constructor(String make, String model, int topSpeed, double price) {
        this(make, model, 4, topSpeed, price);  // numberOfDoors defaults to 4
    }

    // Third constructor: all parameters except make and model
    public E143Constructor(int numberOfDoors, int topSpeed, double price) {
        this("unknown", "unknown", numberOfDoors, topSpeed, price);  // make and model default to "unknown"
    }

    // Fourth constructor: all parameters except topSpeed and price
    public E143Constructor(String make, String model, int numberOfDoors) {
        this(make, model, numberOfDoors, 90, 0.0);  // topSpeed defaults to 90, price defaults to 0
    }

    // Method to display the values
    public void display() {
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
    }

    // Main method for testing
    public static void main(String[] args) {
        E143Constructor car1 = new E143Constructor("Toyota", "Prius", 4, 120, 30000.0);
        car1.display();  // Output: Toyota Prius 4 120 30000.0

        E143Constructor car2 = new E143Constructor("Toyota", "Prius", 120, 30000.0);
        car2.display();  // Output: Toyota Prius 4 120 30000.0

        E143Constructor car3 = new E143Constructor(4, 120, 30000.0);
        car3.display();  // Output: unknown unknown 4 120 30000.0

        E143Constructor car4 = new E143Constructor("Toyota", "Prius", 4);
        car4.display();  // Output: Toyota Prius 4 90 0.0
    }
}
