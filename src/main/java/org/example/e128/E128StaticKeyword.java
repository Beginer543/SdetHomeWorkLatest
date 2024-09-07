package org.example.e128;

public class E128StaticKeyword {

    public static void main(String[] args) {
String s1="12345";
String s2="abcde";
String result=mixString(s1,s2);
        System.out.println(result);
    }
    public static String mixString(String s1,String s2){
if (s1.length()!=s2.length()){

}
StringBuilder result=new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            result.append(s1.charAt(i));
            result.append(s2.charAt(i));

        }
        return result.toString();
    }

}