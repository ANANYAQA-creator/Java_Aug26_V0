package com.rawteananya.OOPs.Constructor_demo;

public class Employee_Constructor_Demo {

    // Instance Variable
    String name;
    String role;
    double salary;

    // Parameterized constructor : Also as per rule constructor name same as Class name.(Employee_Constructor_Demo)
    public Employee_Constructor_Demo(String name , String role, double salary){
        this.name = name;
        this.role = role;
        this.salary = salary;
        // this keyword is used to assign the constructor parameter name to the Object's instance variable name.
        // eg this.name(Object's instance variable) = name (Constructor's parameter)
    }

    public void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("Role : " + role);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args){

        // Object creation
        Employee_Constructor_Demo employee1 = new Employee_Constructor_Demo("Ananya Rawte","QA Engineer", 100000.00);
        Employee_Constructor_Demo employee2 = new Employee_Constructor_Demo("Gaurav","Selenium QA",15000.00);

        /*
        * When this executes:  * new Employee_Constructor_Demo(...)
        ↓
Constructor executes
        ↓
this.name = name
this.role = role
this.salary = salary
        ↓
employee1 initialized*/

        employee1.displayDetails();
        employee2.displayDetails();

    }
}
