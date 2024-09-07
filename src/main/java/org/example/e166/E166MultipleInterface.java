package org.example.e166;

interface Controllable{
    void turnOn();
}

interface Configurable{
   public void configure ();
}



class SmartHomeDevice implements Controllable, Configurable {

    @Override
    public void turnOn() {
        System.out.println("Turning on Smart Home Device");  // Реалізація методу turnOn()
    }

    @Override
    public void configure() {
        System.out.println("Configuring Smart Home Device settings");  // Реалізація методу configure()
    }
}

public class E166MultipleInterface {

    public static void main(String[] args) {
        SmartHomeDevice smartHomeDevice = new SmartHomeDevice() {
        };
        smartHomeDevice.turnOn();
        smartHomeDevice.configure();
    }
}

