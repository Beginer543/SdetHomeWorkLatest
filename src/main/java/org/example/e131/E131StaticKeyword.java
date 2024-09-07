package org.example.e131;

public class E131StaticKeyword {
public static String thirdLetters(String s){
    StringBuilder result =new StringBuilder();
    for (int i = 0; i < s.length(); i+=3) {
        result.append(s.charAt(i));
    }
    return result.toString();
}


    public static void main(String[] args) {
        System.out.println(thirdLetters("hello there"));
        System.out.println(thirdLetters("technology"));
    }
}
