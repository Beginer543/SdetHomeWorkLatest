package org.example.e27;

public class E27GradeCalculatorElseIf {
    public static void main(String[] args) {
        // Hint: Declare 'score' as an int and assign 85 to it
int score=85;
        // Hint: Use if-else if statements to check grades A, B, C, D, F in order
        char grade;
        // Hint: Print the grade using System.out.println()
if (score >=90 && score <=100) {
    grade = 'A';
} else if (score >=80 && score<=89) {
    grade='B';
    }else if (score >=70 && score<=79){
    grade='C';
} else if (score >=60 && score<=69) {
    grade='D';
} else{
    grade='F';
}
        System.out.println("Your grade is: "+ grade);
    }
        // Expected output: "Your grade is: B"
    }
