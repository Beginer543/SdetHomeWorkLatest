package org.example.e164;
abstract class Vehicle {
    abstract void startEngine();

    void stopEngine() {
        System.out.println("Vehicle engine stopped");
    }
}
 class Car extends Vehicle{
void startEngine(){
    System.out.println("Car engine started");
}
void startEngine(String keyType){
    System.out.println("Car engine started with a smart key"+keyType);
}
}

public class E164AbstractClass {
    public static void main(String[] args){
        Vehicle car =new Car();
       car.startEngine();
        ((Car)car).startEngine("a smart key");
       car.stopEngine();

    }
}


