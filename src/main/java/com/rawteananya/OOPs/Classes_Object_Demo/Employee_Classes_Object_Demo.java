package com.rawteananya.OOPs.Classes_Object_Demo;

// CLASSES & OBJECT
public class Employee_Classes_Object_Demo {

    // Variables  Instance variables   : These are instance variables because every object gets its own copy.
    String name;
    String role;
    double salary;

    // Methods
    public void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("Role : " + role);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args){

        Employee_Classes_Object_Demo employee1 = new Employee_Classes_Object_Demo();
        /*Employee_Classes_Object_Demo → class/type
          Employee1 → reference variable
          new Employee_Classes_Object_Demo() → object creation*/

        employee1.name = "Ananya Rawte";
        employee1.role = "QA Automation Engineer";
        employee1.salary = 10000.21;

        Employee_Classes_Object_Demo employee2 = new Employee_Classes_Object_Demo();

        employee2.name = "Gaurav Pardhi";
        employee2.role = "QA Automation Selenium Engineer";
        employee2.salary = 100000.51;

        System.out.println("Employee1 = ");
        employee1.displayDetails();

        System.out.println("Employee2 = ");
        employee2.displayDetails();

    }
}
