package com.rawteananya.OOPs.Static_Final_AccessModifier_Demo;

public class staticFinalTest {

    public static void main (String[] args){

        AutomationConfig.displayConfig();

        System.out.println(AutomationConfig.MAX_RETRY);
        AutomationConfig obj = new AutomationConfig();

        System.out.println(obj.getEnvironment());
    //Correct. You create an object because getEnvironment() is an instance method.
    }
}
