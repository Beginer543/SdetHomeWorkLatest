package org.example.e154;

// Appliance.java
class Appliance {
    // No-Argument Constructor
    public Appliance() {
        System.out.println("Appliance Constructor without argument");
    }

    // Parameterized Constructor
    public Appliance(int wattage) {
        System.out.println("Wattage: " + wattage);
    }
}

// WashingMachine.java
class WashingMachine extends Appliance {
    // No-Argument Constructor
    public WashingMachine() {
        System.out.println("WashingMachine Constructor without argument");
    }

    // Overloaded Constructor
    public WashingMachine(int wattage, int capacity) {
        super(wattage); // Call to Appliance class parameterized constructor
        System.out.println("Capacity: " + capacity);
    }
}

// E154SuperKeyword.java
public class E154SuperKeyword {
    public static void main(String[] args) {
        // Create an object of WashingMachine class without arguments
        WashingMachine wm1 = new WashingMachine();

        // Create an object of WashingMachine class with wattage and capacity
        WashingMachine wm2 = new WashingMachine(500, 7);
    }
}
