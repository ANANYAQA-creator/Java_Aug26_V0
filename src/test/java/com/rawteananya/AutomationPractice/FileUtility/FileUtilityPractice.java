package com.rawteananya.AutomationPractice.FileUtility;

import java.io.IOException;
import java.util.List;

public class FileUtilityPractice {

    public static void main(String[] args) {

        FileUtility fileUtility = new FileUtility();

        //1 Write "Login Test Passed" to execution.log.
        try {
            fileUtility.writeFile("execution.log", "Login Test Passed");
        } catch (IOException e) {
            e.printStackTrace();
        }

    // 2. Append "Payment Test Passed" on a new line.

        try{
            fileUtility.appendToFile("execution.log", "\nPayment Test Passed");
        }catch (IOException e) {
            e.printStackTrace();
        }

        //Check whether the file exists and print the result.
        boolean result = fileUtility.fileExists("execution.log");
        System.out.println( "isFileExist : "+ result);

        // Read and print the complete file using readFile().

        try {
            String result1 = fileUtility.readFile("execution.log");
            System.out.println("Result1 : "+ result1);
        }catch (IOException e) {
            e.printStackTrace();
        }

       // Read the file using readLines() and print each line using a for-each loop.

        try {
           List<String> lines =  fileUtility.readLines("execution.log");

             for (String line : lines){
                 System.out.println(line);
             }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
