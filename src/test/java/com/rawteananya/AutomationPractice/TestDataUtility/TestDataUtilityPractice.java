package com.rawteananya.AutomationPractice.TestDataUtility;

import com.rawteananya.AutomationPractice.BrowserUtility.BrowserUtility;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class TestDataUtilityPractice {

    public static void main(String[] args){

        // Load test data
        TestDataUtility testDataUtility = new TestDataUtility();

        Map<String,String> testData = testDataUtility.loadTestData("testDataUtility.txt");

        // Print test data
        System.out.println("Username : " + testData.get("username"));
        System.out.println("Password : " + testData.get("password"));
        System.out.println("Browser : " + testData.get("browser"));
        System.out.println("Environment : " + testData.get("environment"));
        System.out.println("Project : " + testData.get("project"));

        // Launch browser dynamically

        BrowserUtility browserUtility = new BrowserUtility();
        WebDriver driver = browserUtility.launchBrowser(testData.get("browser"));

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
