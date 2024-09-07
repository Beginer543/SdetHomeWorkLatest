package org.example.e167;
interface BaseDeviceInterface{
    void baseDeviceInterface();
}
interface AdvancedDeviceInterface{
    void advancedFunctionality();
}
class SmartDevice implements AdvancedDeviceInterface{



    public  void baseDeviceInterface(){
        System.out.println("Basic Functionality: Device is turning on");
    }

    public void advancedFunctionality(){
     System.out.println("Advanced Functionality: Device is adjusting settings");
    }
}


public class E167MultipleInterface {

    public static void main(String[] args){
SmartDevice device=new SmartDevice();
device.baseDeviceInterface();
device.advancedFunctionality();

    }
}


