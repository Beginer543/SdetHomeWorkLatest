package org.example.e163;
class StringManipulator{
    private String str;

    public  StringManipulator(String str){
        this.str=str;
    }

   public final  String reverseString (){
        StringBuilder reverseStr=new StringBuilder(str);
        return reverseStr.reverse().toString();

    }
}

    class ArrayManipulator{
       public final double avgElements(int[]arr){
            int sum=0;
            for (int num:arr){
                sum+=num;
            }
            return(double)sum/arr.length;
        }
    }

public class E163FinalKeyword {

    public static void main(String[] args){
        StringManipulator stringManipulator=new StringManipulator("hello");
        String reversed = stringManipulator.reverseString();
        System.out.println(reversed);



    ArrayManipulator arrayManipulators = new ArrayManipulator();
    int[]array={3,4,5,6,6};
    double average=arrayManipulators.avgElements(array);
        System.out.println(average);
}
}
