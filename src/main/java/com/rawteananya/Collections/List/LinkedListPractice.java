package com.rawteananya.Collections.List;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {

        LinkedList<String> testcases = new LinkedList<>();
        testcases.add("Login Test");
        testcases.add("Payment Test");
        testcases.add("Logout Test");

        testcases.addFirst("Smoke Test");
        testcases.addLast("Regression Test");

        System.out.println("First element :- " + testcases.getFirst());
        System.out.println("Last Element :- " + testcases.getLast());

        testcases.removeFirst();
        testcases.removeLast();

        System.out.println(testcases.contains("Payment Test"));
        System.out.println("Total number of testcases :- " + testcases.size());

        for (String testcase : testcases) {
            System.out.println(testcase);
        }
    }
}
