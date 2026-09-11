package com.rawteananya.Conditional_Statements;

public class ConditionalStatements {
    public static void main (String[] args) {

        /*Part 1 — if
age = 26
Check whether age is greater than or equal to 18.

Expected:
Eligible*/

        int age =26;

        if (age >=18){
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");  // if int age =15 then Not Eligible
        }

        /*Part 2 — if-else
boolean loginSuccessful = false
Print:
Login Passed
or:
Login Failed*/

        boolean loginSuccessful = false;

        if(loginSuccessful){
            System.out.println("Login Passed");  // if boolean loginSuccessfull = true then Login passed
        } else {
            System.out.println("Login Failed");
        }

        /*Part 3 — else-if
Create:
marks = 82
Use:
90+ → A+
75–89 → A
60–74 → B
Below 60 → C

Expected:
Grade A*/

        int marks = 82;

        if(marks >= 90){
            System.out.println("A+");
        } else if (marks >= 75) {
            System.out.println("A");
        } else if (marks>= 60  ){
            System.out.println("B");
        } else  {
            System.out.println("C");
        }

/*Part 4 — Nested if

Create:
isLoggedIn = true
isAccountActive = true

Expected:
Access Granted*/

        boolean isLoggedIn = true;
        boolean isAccountActive = true;

        if(isLoggedIn){
            if (isAccountActive){
                System.out.println(" Access Granted");
            }
        }

        /*Part 5 — switch
Create:
browser = "Firefox"
Use switch to print:
Chrome  → Launching Chrome
Firefox → Launching Firefox
Edge    → Launching Edge
Other   → Unsupported Browser

Syntax
switch (value) {

    case value1:
        // code
        break;

    case value2:
        // code
        break;

    default:
        // code
}

*/

        String browser = "Firefox";

        switch (browser) {
            case "Chrome" :System.out.println("Launching Chrome");
            break;

            case "Firefox" :System.out.println("Launching Firefox");
            break;

            case "Edge" :
                System.out.println("Launching Edge");
                break;

            default:
                System.out.println("Unsupported Browser");

        }

        /*Part 6 — 🔥 Automation Scenario
Create:
boolean elementDisplayed = true;
boolean textCorrect = true;

Write a condition where:
Both true → Test Passed
Otherwise → Test Failed
Use &&*/

        boolean elementDisplayed = true;
        boolean textCorrect = true;

        if (elementDisplayed && textCorrect){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

    }
}
