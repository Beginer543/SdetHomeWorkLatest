package org.example.e127;

public class E127StaticKeyword {

    // Non-static method that prints a message
public  void nonStaticMethod(){
    System.out.println("Programming is amazing.");
}    // Static method that prints a message

    public static void staticMethod(){
        System.out.println("Java is awesome.");
    }
    // Main method to execute both methods
    public static void main(String[] args) {
        // Create an instance of the class to call the non-static method
E127StaticKeyword obj=new E127StaticKeyword();
          // Call non-static method
obj.nonStaticMethod();
        // Call the static method directly using the class name
E127StaticKeyword.staticMethod();
         // Call static method
    }
}
