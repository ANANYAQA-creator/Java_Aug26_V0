package com.rawteananya.Java8.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

//Java convention is PascalCase for class/interface names. eg TestAction, TestLogger

// Task 1 :No parameters
@FunctionalInterface
interface TestAction{
    void execute();
}

//Task 2 — One parameter
@FunctionalInterface
interface TestLogger{
    void log(String message);
}

//Task 3 — Two parameters + return
@FunctionalInterface
interface TestCalculator{
    int add (int a,int b);
}

//Task 4 — Automation-style forEach()

public class LambdaPractice {

    public static void main(String[] args){
        // Task 1 :No parameters
        TestAction action = () -> System.out.println("Executing test");
        action.execute();

        //() → no parameters
        //-> → Lambda operator
        //statement → implementation


        //Task 2 — One parameter
        TestLogger testlog = message -> {
            System.out.println( "LOG: " +message);
        };
        testlog.log("Login test started");

        //You could also write it more concisely:
        //testLogger testlog = message -> System.out.println("LOG: " + message);

        //Task 3 — Two parameters + return

        TestCalculator calculator = (a,b) -> {
            return a+b;
        };

        System.out.println(calculator.add(10, 20));

        //Or shorter Lambda syntax:
        //TestCalculator calculator = (a, b) -> a + b;
        //Because a single expression has an implicit return.

        //Task 4 — Automation-style forEach()

        List<String> testCases = new ArrayList<>();

        testCases.add("TC001 -Login");
        testCases.add("TC002 - Payment");
        testCases.add("TC003 - Logout");

       // Print them using Lambda + forEach():

        testCases.forEach(
                testCase -> System.out.println(testCase)
        );
    }
}
