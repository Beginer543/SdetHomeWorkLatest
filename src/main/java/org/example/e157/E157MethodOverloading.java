package org.example.e157;

class TransactionCalculator {
    void calculateProfit(int a, int b) {
        System.out.println(a - b);
        return;
    }

    void calculateProfit(int a, int b, int c) {
        System.out.println(a - b - c);
        ;
        return;
    }

    void calculateProfit(int a, int b, int c, int d) {
        System.out.println(a - b - c - d);
        return;
    }
}
    public class E157MethodOverloading {
        public static void main(String[] args) {
            TransactionCalculator t=new TransactionCalculator();
      t.calculateProfit(100,20,30,10);

            TransactionCalculator t1=new TransactionCalculator();
t1.calculateProfit(80,30,20);

            TransactionCalculator t2=new TransactionCalculator();
t2.calculateProfit(50,30);

        }
    }


