package org.example.e122;

public class E122Variables {
    // Instance variables
    String countryName;
    String capital;
    int populationSize;

    // Method to display values of instance variables
    public void display() {
        System.out.println("The capital of " + countryName + " is " + capital + " and population is " + populationSize);
    }

    public static void main(String[] args) {
        // Creating the first object and assigning values
        E122Variables country1 = new E122Variables();
        country1.countryName = "USA";
        country1.capital = "Washington DC";
        country1.populationSize = 330000000;

        // Creating the second object and assigning values
        E122Variables country2 = new E122Variables();
        country2.countryName = "Kazakhstan";
        country2.capital = "Astana";
        country2.populationSize = 18500000;

        // Displaying the values for both objects
        country1.display();
        country2.display();
    }
}
