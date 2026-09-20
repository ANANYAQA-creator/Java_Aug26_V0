package com.rawteananya.Java8.FunctionalInterface;
@FunctionalInterface
interface TestAction {
    void executeTest();
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        TestAction action = () -> System.out.println("Executing automation test");
        action.executeTest();
    }
}