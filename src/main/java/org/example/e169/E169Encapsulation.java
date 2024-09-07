package org.example.e169;

class Employee {
    private String empName;
    private int empAge;


    public String getEmpName() {
        return empName;
    }


    public void setEmpName(String empName) {
        this.empName = empName;
    }


    public int getEmpAge() {
        return empAge;
    }


    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}

public class E169Encapsulation {
    public static void main(String[] args) {

        Employee employee = new Employee();


        employee.setEmpName("John");
        employee.setEmpAge(30);


        System.out.println("Employee Name: " + employee.getEmpName());
        System.out.println("Employee Age: " + employee.getEmpAge());
    }
}
