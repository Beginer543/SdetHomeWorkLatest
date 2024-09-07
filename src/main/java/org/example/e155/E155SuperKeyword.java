package org.example.e155;

class Company{
    public  Company() {
        System.out.println("Company Established");
    }
}

class Department extends Company{
public Department (){
   super();
    System.out.println("Department Created");

}

}

class Employee extends Department{
    public Employee(){
        super();
        System.out.println("Employee Hired");
    }
}

public class E155SuperKeyword {
    public static void main(String[] args) {
Employee e =new Employee();
        System.out.println();
    }
}

