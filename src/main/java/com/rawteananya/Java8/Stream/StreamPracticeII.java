package com.rawteananya.Java8.Stream;
import java.util.*;
import java.util.stream.Collectors;

public class StreamPracticeII {

    public static void main(String[] args){

        List<String> testCases = Arrays.asList(
                "Login Test",
                "Payment Test",
                "Login Test",
                "Logout Test",
                "Transfer Test",
                "Payment Test"
        );

        // Task 1 — Sorted Print all test cases in alphabetical order using:

        testCases.stream()
                .sorted()
                .forEach(System.out::println);
        //Interview point: sorted() returns a stream with elements sorted according to their natural order by default.

        //Task 2 — Collect Create a new List<String> containing only: Login Test

        List<String> loginTest =  testCases.stream()
                       .filter(test -> test.equals("Login Test"))
                       .collect(Collectors.toList());
        System.out.println(loginTest);

         //Task 3 — Find First : Find the first test case containing "Payment" using:

        Optional<String> firstResult = testCases.stream()
                .filter( test -> test.contains("Payment"))
                .findFirst();
        System.out.println(firstResult);

        //Interview point ⭐
        //findFirst() returns an Optional because there may be no matching element.

        //Task 4 — Any Match
        //Check whether any test case contains "Transfer".
        //Expected:true

        boolean transferExist = testCases.stream()
                .anyMatch(test -> test.contains("Transfer"));
        System.out.println(transferExist);

        //At least one element satisfies the condition.

        //Task 5 — All Match Check whether all test cases contain "Test".
        //Expected:
        //true

        boolean allTest = testCases.stream().allMatch( test -> test.contains("Test")
        );
        System.out.println(allTest);
        //Every element satisfies the condition.
    }
}


        /*
        ⭐ Bonus — Automation-style

Imagine:
List<WebElement> elements = driver.findElements(By.tagName("a"));

Write a Stream statement to convert:
List<WebElement>

into:
List<String>

containing the text of every link.
We want:
List<WebElement>
       ↓
     stream
       ↓
     map()
       ↓
   getText()
       ↓
   collect()
       ↓
List<String>

Ans. List<String> linkTexts =
elements.stream()
.map( element-> element.getText())
.collect(Collectors.toList());

         */


