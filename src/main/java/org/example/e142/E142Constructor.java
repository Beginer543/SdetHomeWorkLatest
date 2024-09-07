package org.example.e142;

public class E142Constructor {
    private String schoolName;
    private int batch;
    private int year;
    private String lastDayOfClass;

    // Non-argument constructor
    public E142Constructor() {
        // Explicit initialization is optional as default values are assigned
        this.schoolName = null;
        this.batch = 0;
        this.year = 0;
        this.lastDayOfClass = null;
    }

        // Parameterized constructor
    public E142Constructor(String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }

    // Method to display the values
    public void display() {
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
    }

    public static void main(String[] args) {
        // Creating an object using the non-argument constructor
        E142Constructor obj1 = new E142Constructor();
        obj1.display(); // Output: null 0 0 null

        // Creating an object using the parameterized constructor
        E142Constructor obj2 = new E142Constructor("Syntax", 6, 2020, "07/30/2020");
        obj2.display(); // Output: Syntax 6 2020 07/30/2020
    }
}
