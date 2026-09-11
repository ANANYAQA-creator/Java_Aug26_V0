package com.rawteananya.JavaBasics_Syntax;

public class JavaBasics {

    // non static
    public void displayMessage() {
        System.out.println("Hello Java\n" +
                "Learning Java for Selenium Automation");

    }
    // displayMessage() is non-static, so we need an object to call it
    public static void main(String[]args)  {
        JavaBasics obj = new JavaBasics();
        obj.displayMessage();
    }
}
/*
JVM
 ↓
static main()
 ↓
JavaBasics obj = new JavaBasics()
 ↓
obj.displayMessage()
 ↓
displayMessage() executes
*/
