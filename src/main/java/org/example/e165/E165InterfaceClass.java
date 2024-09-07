package org.example.e165;

interface ElectronicDevice {
    void turnOn();

    void turnOff();
}
    class Smartphone implements ElectronicDevice {

       @Override
       public void turnOn() {
            System.out.println("Smartphone is turning on");
        }
@Override
        public void turnOff() {
            System.out.println("Smartphone is turning off");
        }
    }
 class Laptop implements ElectronicDevice{


    public void turnOn(){
        System.out.println("Laptop is turning on");
    }

     @Override
     public void turnOff() {
         System.out.println("Laptop is turning off");
     }


     public void turnOf(){
        System.out.println("Laptop is turning off");
    }
}
public class E165InterfaceClass {

    public static void main(String[] args) {
 ElectronicDevice smartphone=new Smartphone();
smartphone.turnOn();
smartphone.turnOff();

     ElectronicDevice l=new Laptop();
     l.turnOn();
     l.turnOff();

    }

}