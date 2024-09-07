package org.example.e150;

public class E150Inheritance {

    public static void main(String[] args) {
        // Step 5: Testing the classes in the main method

        // Create an Employee object and print its details
        Employee e = new Employee("Joe", "Smith", 35, 35000);
        e.printEmployeeDetails();

        // Create a Student object and print its details
        Student s = new Student("Adam", "Smith", 15, 10);
        s.printStudentDetails();

        // Create a Retiree object and print its details
        Retiree r = new Retiree("Frank", "Smith", 15, 10000, "tour");
        r.printRetireeDetails();
    }
}

class Person {
    private String name;
    private String lastName;
    private int age;

    // Constructor to initialize Person properties
    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    // Getters for encapsulation
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}

// Step 2: Employee Class (Subclass of Person)
class Employee extends Person {
    private int salary;

    // Constructor to initialize Employee properties along with inherited ones
    public Employee(String name, String lastName, int age, int salary) {
        super(name, lastName, age);
        this.salary = salary;
    }

    // Method to print Employee details
    public void printEmployeeDetails() {
        System.out.println(getName() + " " + getLastName() + " " + getAge() + " " + salary);
    }
}

// Step 3: Student Class (Subclass of Employee)
class Student extends Employee {
    private int grade;

    // Constructor to initialize Student properties along with inherited ones
    public Student(String name, String lastName, int age, int grade) {
        super(name, lastName, age, 0); // salary is not needed for students
        this.grade = grade;
    }

    // Method to print Student details
    public void printStudentDetails() {
        System.out.println(getName() + " " + getLastName() + " " + getAge() + " " + grade);
    }
}

// Step 4: Retiree Class (Subclass of Student)
class Retiree extends Student {
    private String seniorActivity;

    // Constructor to initialize Retiree properties along with inherited ones
    public Retiree(String name, String lastName, int age, int grade, String seniorActivity) {
        super(name, lastName, age, grade);
        this.seniorActivity = seniorActivity;
    }

    // Method to print Retiree details
    public void printRetireeDetails() {
        System.out.println(getName() + " " + getLastName() + " " + getAge() + " " + seniorActivity);
    }
}
