package com.rawteananya.Operators;

public class AssignmentOperator {
    public static void main(String[] args){

        int count = 10;
       //+=

        System.out.println(count += 5); //Result: 15
       // Same as: count = count + 5;

       // Similarly:
        System.out.println(count -= 5); //10
        System.out.println(count *= 2); // 20
        System.out.println(count /= 2); // 10

        /*Key point
Assignment operators modify the existing value of the variable.
+= → add and assign
-= → subtract and assign
*= → multiply and assign
/= → divide and assign
%= → modulus and assign*/
    }
}
