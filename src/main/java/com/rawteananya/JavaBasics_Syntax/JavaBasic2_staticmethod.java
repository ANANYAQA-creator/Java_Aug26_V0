package com.rawteananya.JavaBasics_Syntax;

public class JavaBasic2_staticmethod {

    /*
    Static method :-  calls directly without object
public static void displayMessage() {
}
Call directly:
displayMessage();

or:
JavaBasics.displayMessage();
No object required.

*/
    public static void displayMessage2(){
        System.out.println("Hello Java");
        System.out.println("Learning Java for Selenium Automation");
        System.out.println("I am Shiv");
    }

    public static void main (String[]args){
        displayMessage2();
    }
}
