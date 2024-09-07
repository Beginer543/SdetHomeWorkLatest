package org.example.e129;

public class E129StaticKeyword {
    private static  String countryName;
    private static String continent;

    public static void main(String[] args) {
countryName="Morocco";
continent="Africa";
display();
        }

        public static  void display(){
        System.out.println(countryName + " located on " + continent + " continent");
        }
    }
