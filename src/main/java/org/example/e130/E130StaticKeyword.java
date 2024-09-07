package org.example.e130;

public class E130StaticKeyword {
    public  static  void mystery(int []arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                arr [i]=arr[i]/2;
            }else {
                arr[i]=arr[i]*10;
            }
    }
    }
    public static void main(String[] args) {
            int [] arr ={1, 2, 3, 4, 5};
mystery(arr);
            for (int num:arr) {
                System.out.print(num+" ");
                
            }
        }


    }
