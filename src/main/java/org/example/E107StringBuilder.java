package org.example;

public class E107StringBuilder {
    public static void main(String[] args) {
        // Given string
        String given = "Hello Friends";

        // Instantiate an object of the StringBuffer class with the given string
StringBuffer sb=new StringBuffer(given);
        // Use the reverse() method to reverse the string
sb.reverse();
        // Print the reversed string
        System.out.println(sb.toString());
    }
}
