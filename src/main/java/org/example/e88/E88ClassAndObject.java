package org.example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {
        // Create a class named 'Dog'
Dog d1=new Dog();
        // Declare String variables named 'breed', 'name', and 'color'

        // Declare methods named 'bark()', 'run()', and 'play()' that print messages in the specified format

        // Create the first object of the class 'Dog' with breed = "Husky", name = "AnyName", color = "AnyColor"
d1.breed="Husky";
d1.name="AnyName";
d1.color="AnyColor";
d1.bark();
d1.run();
d1.play();


        // Create the second object of the class 'Dog' with breed = "Bulldog", name = "AnyName", color = "AnyColor"

        Dog  d2=new Dog();
        d2.breed="Bulldog";
        d2.name="AnyName";
        d2.color="AnyColor";
        d2.bark();
        d2.run();
        d2.play();
        // Create the third object of the class 'Dog' with breed = "Labrador", name = "AnyName", color = "AnyColor"
Dog d3=new Dog();
d3.breed="Labrador";
d3.name="AnyName";
d3.color="AnyName";
d3.bark();
d3.run();
d3.play();
        // Call the methods 'bark()', 'run()', and 'play()' for each object



    }
}
