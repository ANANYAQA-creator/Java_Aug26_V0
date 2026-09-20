package com.rawteananya.Collections.Set;

import java.util.HashSet;

public class HashSetPractice {

    public static void main(String[] args) {

        HashSet<String> testCases = new HashSet<>();

        testCases.add("TC001 - Login");
        boolean added = testCases.add("TC002 - Payment");
        System.out.println(added);
        testCases.add("TC003 - Logout");
        testCases.add("TC001 - Login");  // Duplicate
        testCases.add("TC004 - Transfer");

        System.out.println(testCases);

        System.out.println(testCases.contains("TC004 - Transfer"));
        testCases.remove("TC003 - Logout");
        System.out.println("Total number of testcases :- "+ testCases.size());

        for (String testcase : testCases){
            System.out.println(testcase);
        }
    }
}
