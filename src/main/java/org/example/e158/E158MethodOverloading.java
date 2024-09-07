package org.example.e158;

import static java.lang.System.*;

class LoanPaymentCalculator{

void calculatePayment(double loanAmount,double interestRate) {
    //Implement logic to calculate the monthly payment assuming a fixed 12-month term. Use the formula:
double monthlyPayment   = (loanAmount * (1 + interestRate /100))/ 12;
    out.printf("%.2f\n",monthlyPayment);
    }

void calculatePayment(double loanAmount,double interestRate,double numberOfMonths){
    //mplement logic to calculate the monthly payment using the formula:
    // pay
    double monthlyPayment=(loanAmount * (1 + interestRate/ 100))/ numberOfMonths;
    out.printf("%.2f\n",monthlyPayment);
}
void calculatePayment(double loanAmount,double interestRate, double numberOfMonths,double downPayment){
double monthlyPayment=((loanAmount - downPayment) * (1 + interestRate /100)) /numberOfMonths;
    out.printf("%.2f\n",monthlyPayment);
}
}
public class E158MethodOverloading {
    public static void main(String[] args) {
        LoanPaymentCalculator l = new LoanPaymentCalculator();
        l.calculatePayment(10000, 5);
        LoanPaymentCalculator l1 = new LoanPaymentCalculator();
        l1.calculatePayment(10000, 5, 24);
        LoanPaymentCalculator l2 = new LoanPaymentCalculator();
        l2.calculatePayment(10000, 5, 24, 2000);


    }
}
