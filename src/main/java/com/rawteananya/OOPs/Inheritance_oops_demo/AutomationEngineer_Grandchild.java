package com.rawteananya.OOPs.Inheritance_oops_demo;

public class AutomationEngineer_Grandchild extends QAEngineer_child{

    public void automateTests(){
        System.out.println("Automation Engineer is writing Selenium tests");
    }

    public static void main (String[] args){

        AutomationEngineer_Grandchild obj = new AutomationEngineer_Grandchild();

        System.out.println("Name : " + obj.name);
        obj.work();
        obj.testApplications();
        obj.automateTests();
    }
}
