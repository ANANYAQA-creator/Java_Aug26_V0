package com.rawteananya.AutomationPractice.FileUtility;

import java.io.IOException;

public class FileUtilityPracticeII {
    public static void main(String[] args) {
        FileUtility fileUtility = new FileUtility();

        try {
            fileUtility.writeFile("execution.log", "Login Test Passed");
            fileUtility.appendToFile(
                    "execution.log", "\nPayment Test Passed"
            );

            System.out.println(
                    fileUtility.readFile("execution.log")
            );

        } catch (IOException e) {
            throw new RuntimeException(
                    "File operation failed", e
            );
        }
    }
}