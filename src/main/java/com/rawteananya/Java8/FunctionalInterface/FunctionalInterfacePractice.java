package com.rawteananya.Java8.FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacePractice {

    public static void main (String[] args){

        //Task 1 — Predicate : Check whether a test case contains "Login": takes input return boolean  test()

        Predicate<String> isLoginTest = test -> test.contains("Login");
        System.out.println(isLoginTest.test("TC001 - Login"));
        System.out.println(isLoginTest.test("TC002 - Payment"));

        //Output:
        //true
        //false

        //Correct:
        //Predicate → condition → boolean
        //test() → executes condition

        //Task 2 — Consumer : take input returns nothing  accept()

        Consumer<String> testLogger = test -> System.out.println("Executing " + test);
        testLogger.accept("TC001 - Login");

        //Output:
        //Executing TC001 - Login
        //Correct:
        //Consumer → takes input → performs action → returns nothing
        //accept() → executes Consumer

        // Task 3 — Function : takes input returns result

        Function<String,String> browserConverter = browser-> browser.toUpperCase();
        System.out.println(browserConverter.apply("chrome"));

        //Output:
        //CHROME

        //And your generic types are correct:
        //Function<String, String>
        //           ↓       ↓
        //          Input   Output

        //Task 4 — Supplier
        Supplier<String> environment = () -> "QA";
        System.out.println(environment.get());

        //Output:
        //QA

        //Correct:
        //Supplier → no input → provides a value
        //get() → retrieves supplied value
    }
}

/*
🧠 Most Important Comparison:
| Interface       | Input | Return  | Method     |
| --------------- | ----- | ------- | ---------- |
| `Predicate<T>`  | 1     | boolean | `test()`   |
| `Consumer<T>`   | 1     | nothing | `accept()` |
| `Function<T,R>` | 1     | result  | `apply()`  |
| `Supplier<T>`   | 0     | result  | `get()`    |

Super easy memory:
Predicate → test()
Consumer  → accept()
Function  → apply()
Supplier  → get()
 */