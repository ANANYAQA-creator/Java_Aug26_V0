package com.rawteananya.ExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinalExceptionExercise {

    public void clickLoginButton(WebDriver driver) {
        try {
            WebElement loginButton = driver.findElement(By.id("invalid-login-button"));
            loginButton.click();
        } catch (NoSuchElementException e) {
            System.out.println("Login button not found");
        } finally {
            System.out.println("Click operation completed");
        }
    }

    public static void main (String[]args){

        WebDriver driver = new ChromeDriver();
        try{
        FinalExceptionExercise obj = new FinalExceptionExercise();
       obj.clickLoginButton(driver);
        } finally {
            driver.quit();
        }
        }
    }
