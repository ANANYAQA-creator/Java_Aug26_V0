package com.rawteananya.Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamChallengeFinal {
    public static void main(String [] args){

        List<String> testCases = Arrays.asList(
                "Login Test",
                "Payment Test",
                "Login Test",
                "Logout Test",
                "Payment Test",
                "Transfer Test",
                "Login Test"
        );

       // Task 1 ⭐⭐⭐ Create a List<String> containing only unique "Login Test" entries.

        List<String> loginTest = testCases.stream()
                .filter(test ->test.equals("Login Test"))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(loginTest);

        //Task 2 ⭐⭐⭐⭐ Create a list containing all unique test cases in uppercase and alphabetical order.

        List<String> taskII = testCases.stream()
                .distinct()
                .map(test -> test.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(taskII);

      //  Task 3 ⭐⭐⭐⭐⭐ Check whether any test case contains "Transfer".

        boolean valid = testCases.stream()
                .anyMatch(test ->test.contains("Transfer"));
        System.out.println(valid);

      //  Task 4 ⭐⭐⭐⭐⭐ Find the first test case containing "Payment".

        Optional<String> firstFinding = testCases.stream()
                .filter(test -> test.contains("Payment"))
                .findFirst();
        System.out.println(firstFinding);

        /*Task 5 ⭐⭐⭐⭐⭐ Automation

        List<WebElement> elements = driver.findElements(By.tagName("a"));

List <String> linkTexts = elements.stream()
.map(WebElement::getText)     //Method reference → Class::method
.filter( text -> !text.isBlank())
.distinct()
.sorted()
.collect(Collectors.toList());

System.out.println(linkTexts)


         */

    }
}
