package com.rawteananya.Java8.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {

        List<String> testCases = Arrays.asList(
                "Login Test",
                "Payment Test",
                "Login Test",
                "Logout Test",
                "Transfer Test"
        );

        //Task 1 — filter() ; Print only Login tests.

        testCases.stream()
                .filter(testcase -> testcase.contains("Login Test"))
                .forEach(System.out::println);
        //filter() ka job = select elements based on condition.

        //Task 2 — map() :Print all test cases in uppercase.

        testCases.stream()
                .map(test -> test.toUpperCase())
                .forEach(System.out::println);
        //map() → transform each element

        //Task 3 — distinct() :Print test cases without duplicates.

        testCases.stream()
                .distinct()
                .forEach(System.out::println);

        //distinct() remove duplicate elements.

        //Task 4 — count() : count total number of tcs
        long count =  testCases.stream().count();
        System.out.println("Total test cases: " + count);

         //Task 5 ⭐ — Combine operations

        testCases.stream()
                .filter(test -> test.contains("Login Test"))
                .distinct()
                .map(test -> test.toUpperCase())
                .forEach(System.out::println);
    }
}
