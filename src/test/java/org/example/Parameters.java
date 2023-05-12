package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parameters {

    @Test
    @org.testng.annotations.Parameters("browser")
    public void testparameters(String browser){

        if(browser.equals("chrome")){

            System.out.println("Opening chrome browser");
            System.setProperty("webdriver.chrome.driver", "/Users/aditya/Downloads/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/login/");

        }else {

            System.setProperty("webdriver.edge.driver", "/Users/aditya/Downloads/msedgedriver");
            WebDriver driver = new EdgeDriver();
            driver.get("https://www.facebook.com/login/");

        }



    }
}
