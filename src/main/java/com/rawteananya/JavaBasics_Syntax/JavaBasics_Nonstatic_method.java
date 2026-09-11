package com.rawteananya.JavaBasics_Syntax;

public class JavaBasics_Nonstatic_method {

    /*
    Non-static method :-  call through Object
public void displayMessage() {
}

Call through an object:
JavaBasics obj = new JavaBasics();
obj.displayMessage();
*/

    public void displayMessage() {
        System.out.println("Hello Java\n" +
                "Learning Java for Selenium Automation");

    }

    // displayMessage() is non-static, so we need an object to call it
    public static void main(String[]args)  {
        JavaBasics_Nonstatic_method obj = new JavaBasics_Nonstatic_method();
        obj.displayMessage();
    }
}

/*
JVM
 ↓
static main()
 ↓
JavaBasics_Nonstatic_method obj = new JavaBasics_Nonstatic_method()
 ↓
obj.displayMessage()
 ↓
displayMessage() executes
*/
