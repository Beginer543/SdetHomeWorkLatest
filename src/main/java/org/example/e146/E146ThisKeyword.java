package org.example.e146;

public class E146ThisKeyword {
    private String name;
    private String lastName;
private int employeeId;
private String startDate;
private int salary;

public E146ThisKeyword (){
    this.name=null;
    this.lastName=null;
    this.employeeId=0;
    this.startDate=null;
    this.salary=0;
}
public E146ThisKeyword(String name1,String lastName1,int employeeId1, String startDate1, int salary1){
  this.name=name1;
  this.lastName=lastName1;
  this.employeeId=employeeId1;
  this.startDate=startDate1;
  this.salary=salary1;
}
void display(){
    System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
}
    public static void main(String[] args) {
        E146ThisKeyword emp=new E146ThisKeyword() ;{
            emp.display();
        }
E146ThisKeyword emp1=new E146ThisKeyword("Joe", "Smith", 12345, "01/01/1970", 35000);
       emp1.display();
    }

}



