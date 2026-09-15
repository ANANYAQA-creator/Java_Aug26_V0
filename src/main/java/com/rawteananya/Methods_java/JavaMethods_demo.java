package com.rawteananya.Methods_java;

public class JavaMethods_demo {

    public static void main(String[] args) {

        JavaMethods_demo jm = new JavaMethods_demo();  // object created
        //  Part 1 — Simple void method
        jm.displayMessage();  //Correct use of an object to call a non-static method.

        // Part 2 — Parameter
        jm.greetUser("Ananya");

        // Part 3 — Two parameters
        jm.addNumbers(10, 20);

        //Part 4 — Return value
        System.out.println(jm.multiply(2, 5));

        //Part 5 — Return String
        System.out.println(jm.getBrowser());

        // Part 6 — Selenium-style ⭐
        System.out.println(jm.isLoginSuccessful("Login Successful","Login Successful"));


    }

    //  Part 1 — Simple void method
    public void displayMessage() {
        System.out.println("Learning Java Methods");
    }

    // Part 2 — Parameter
    public void greetUser(String username) {
        System.out.println("Hello" + username);
    }

    // Part 3 — Two parameters
    public void addNumbers(int a, int b) {
        System.out.println(a + b);
    }

    // Part 4 — Return value
    public int multiply(int a, int b) {
        return a * b;
    }

    //Part 5 — Return String
    public String getBrowser() {
        return "Chrome";
    }

    // Part 6 — Selenium-style ⭐
    public boolean isLoginSuccessful(String actual, String expected) {
        return actual.equals(expected);
    }
}