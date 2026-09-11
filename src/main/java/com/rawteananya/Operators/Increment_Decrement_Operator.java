package com.rawteananya.Operators;

public class Increment_Decrement_Operator {
    public static void main (String [] args){

        int count = 10;

        /*
 | Operator  | Meaning        | Example                   |
| --------- | -------------- | ------------------------- |
| `count++` | Post-increment | Use value first → then +1 |
| `++count` | Pre-increment  | +1 first → then use value |
| `count--` | Post-decrement | Use value first → then -1 |
| `--count` | Pre-decrement  | -1 first → then use value |

* */
        //Post increment count++ increment Operator increased by 1
        System.out.println(count++); //10
        // Post Decrement count-- Decrement Operator decreased by 1
        System.out.println(count--); //11
        // Pre increment ++count
        System.out.println(++count); // 11
        // Pre decrement --count
        System.out.println(--count); //10

    }
}
