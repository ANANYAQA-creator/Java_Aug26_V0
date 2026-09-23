package com.rawteananya.AutomationPractice.BrowserUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtility {
     public WebDriver launchBrowser(String browser) {
          WebDriver driver;

          switch (browser.toLowerCase()) {
               case "chrome":
                    //ChromeDriver
                    driver = new ChromeDriver();
                    break;

               case "firefox":
                    //Firefox driver
                    driver = new FirefoxDriver();
                    break;

               case "edge" :
                    //Edge Browser
                    driver = new EdgeDriver();
                    break;

               default: throw new IllegalArgumentException("Unsupported browser : " + browser);
          }

          driver.manage().window().maximize();
          return driver;
     }
}
