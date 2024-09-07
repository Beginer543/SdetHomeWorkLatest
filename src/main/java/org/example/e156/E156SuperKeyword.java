package org.example.e156;

class Animal{
    String sound="Some generic animal sound";

}
class Dog extends Animal {
    // Declare a String variable named sound (shadows the sound in Animal)
    String sound = "Bark";

    public void displaySound() {
            // Виведення змінної sound з класу Dog
            System.out.println(sound);
            // Виведення змінної sound з класу Animal через super
            System.out.println(super.sound);
        }
    }

public class E156SuperKeyword {
    public static void main(String[] args) {
Dog d=new Dog();
        d.displaySound();
    }
}
