package com.rawteananya.Array;

public class JavaArrays {
    public static void main(String [] args){

        //1. Create an int array with 5 numbers and print all values.

          int[] numbers = {21,25,26,29,35};
        for (int number : numbers){
            System.out.println(number);
        }

        System.out.println("-------------------------------------------------------");
        //2.Print the first and last element.
        System.out.println(numbers[0]); // first element
      //  System.out.println(numbers[1]);
      //  System.out.println(numbers[2]);
      //  System.out.println(numbers[3]);
        System.out.println(numbers[4]); // last element

        System.out.println("-------------------------------------------------------");

        //3. Print the array length.
        System.out.println(numbers.length);

        System.out.println("-------------------------------------------------------");
        // 4. Change the third element and print the updated array.
        numbers[2] = 99;
        for (int number : numbers){
            System.out.println(number);
        }
        System.out.println("-------------------------------------------------------");

        //5. Use a for loop to print all elements.
        for (int i =1 ; i<=5 ;  i++){
            System.out.println(i);
        }

        System.out.println("-------------------------------------------------------");
        //6.Use a for-each loop to print all elements.

        for (int number : numbers){
            System.out.println(number);
        }

        System.out.println("-------------------------------------------------------");

       //7. Selenium-style scenario: create an array:
        String[] browsers = {"Chrome", "Firefox", "Edge", "Safari"};

        for (String browser : browsers){
            if (browser.equals("Edge")){
                System.out.println("Edge browser found");
                break;
            }
        }

    }
}
