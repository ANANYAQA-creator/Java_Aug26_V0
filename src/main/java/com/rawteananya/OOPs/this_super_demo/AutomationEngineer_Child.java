package com.rawteananya.OOPs.this_super_demo;

public class AutomationEngineer_Child extends Employee_Parent{

    String role = "QA Automation Engineer";  // child role

    public void displayDetails() {
        System.out.println("Child role : " + this.role);
        System.out.println("Parent role : " + super.role);
        super.displayRole();
    }

    public static void main (String [] args){

        AutomationEngineer_Child obj = new AutomationEngineer_Child();
        obj.displayDetails();
    }
}