package org.example.e136;

public class E136AccessModifiers {

    // Private method
    private void privateMethod() {
        System.out.println("This is Private Method");
    }

    // Default (package-private) method
    void defaultMethod() {
        System.out.println("This is Default Method");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("This is Protected Method");
    }

    // Public method
    public void publicMethod() {
        System.out.println("This is Public Method");
    }

    public static void main(String[] args) {
        // Create an instance of the class to call the methods
        E136AccessModifiers obj = new E136AccessModifiers();

        // Call the methods in the specified order
        obj.privateMethod();
        obj.defaultMethod();
        obj.protectedMethod();
        obj.publicMethod();
    }
}