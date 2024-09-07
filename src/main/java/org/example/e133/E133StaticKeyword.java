package org.example.e133;

public class E133StaticKeyword {
    public static void main(String[] args) {
        System.out.println(countA("aaa"));
        System.out.println(countA("aaBBdf8k3AAadnklA"));
    }
    public static int countA(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        return count;
        }

        }


