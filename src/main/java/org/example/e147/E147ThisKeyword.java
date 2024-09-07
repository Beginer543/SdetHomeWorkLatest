package org.example.e147;

public class E147ThisKeyword {
    private String model;
    private double price;
    private int quantity;

    public  E147ThisKeyword (String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    void carStockValue() {
        double totalValue = this.price * this.quantity;  // Fixed variable name to follow Java naming conventions
        System.out.println(this.model + " Stock Value " + totalValue);
    }

    // Step 4: Main method to test the CarObject class
    public static void main(String[] args) {
        // Creating an object of E147ThisKeyword class

        E147ThisKeyword car = new E147ThisKeyword ("Toyota 2019", 50000.0, 50);
        car.carStockValue();
        E147ThisKeyword car1=new E147ThisKeyword("BMW 2019", 10883.0, 60);
        car1.carStockValue();
    }
}
