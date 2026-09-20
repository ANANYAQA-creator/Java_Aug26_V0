package com.rawteananya.OOPs.Encapsulation_Demo;

public class Employee_Encapsulation_Demo {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0)
        {
        this.salary = salary;
    }
    }

    private String name;
    private String role;
    private double salary;

public static void main(String[] args){

    Employee_Encapsulation_Demo employee = new Employee_Encapsulation_Demo();
    employee.setName("Ananya Rawte");
    employee.setRole("QA Automation Engineer");
    employee.setSalary(100000.50);

    System.out.println( "Employee Name : "+ employee.getName());
    System.out.println("Employee Role : "+ employee.getRole());
    System.out.println("Employee Salary : " +employee.getSalary());

    Employee_Encapsulation_Demo employee2 = new Employee_Encapsulation_Demo();
    employee2.setName("Gaurav Pardhi");
    employee2.setRole("QA Automation Engineer");
    employee2.setSalary(-6000);

    System.out.println( "Employee2 Name : "+ employee2.getName());
    System.out.println("Employee2 Role : "+ employee2.getRole());
    System.out.println("Employee2 Salary : " +employee2.getSalary());  //0

}
}
