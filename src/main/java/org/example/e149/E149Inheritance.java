package org.example.e149;

public class E149Inheritance {

    public static void main(String[] args) {
        // Create an object of Car class and initialize it
        Car car = new Car();
        car.make = "Toyota";
        car.year = 2020;
        car.model = "Corolla";

        // Display car information
        car.displayCarInfo();
    }
}

class Vehicle {
    // Instance Variables
    String make;
    int year;

    // Method to Display Vehicle Info
    public void displayInfo() {
        System.out.println("Vehicle: " + make + ", Year: " + year);
    }
}

// Car.java
class Car extends Vehicle {
    // Instance Variable
    String model;

    // Method to Display Car Info
    public void displayCarInfo() {
        displayInfo(); // Call to Vehicle class method
        System.out.println("Model: " + model);
    }
}
