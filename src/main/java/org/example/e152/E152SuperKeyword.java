package org.example.e152;
class Building{
private String location;
public Building(String location){
    this.location=location;
    System.out.println(this.location);
}
public  Building(){
    System.out.println("Building constructor");
}
}

class  House extends Building{
    public House(String location){
        super(location);
    }
}
public class E152SuperKeyword {
    public static void main(String[] args) {
        House h=new House("Vienna");

    }
}
