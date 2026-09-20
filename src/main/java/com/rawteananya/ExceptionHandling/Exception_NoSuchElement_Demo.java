package com.rawteananya.ExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception_NoSuchElement_Demo {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        try{
            WebElement searchbutton = driver.findElement(By.id("invalid-login-button"));
            searchbutton.click();
        }catch (NoSuchElementException e){
            System.out.println("Element not found");
        }finally {
            driver.quit();
        }
    }
}
