package com.rawteananya.AutomationPractice.BrowserUtility;

import org.openqa.selenium.WebDriver;

public class BrowserUtilityPractice {
    public static void main(String [] args){

        BrowserUtility browserUtility = new BrowserUtility();
        WebDriver driver = browserUtility.launchBrowser("chrome");
        driver.get("https://the-internet.herokuapp.com/login");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
