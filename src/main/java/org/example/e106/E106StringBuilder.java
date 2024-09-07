package org.example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {
        // Instantiate an object of the StringBuffer class
StringBuilder sb =new StringBuilder();
        // Append the value "Hello" to the StringBuffer
        sb.append("Hello") ;
        // Append the value "World" to the StringBuffer
      sb.append(" ");
      sb.append("World");
        // Convert the StringBuffer content to uppercase and print it

        System.out.println(sb.toString().toUpperCase());
    }
}
