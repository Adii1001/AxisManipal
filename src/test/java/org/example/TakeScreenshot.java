package org.example;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "/Users/aditya/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");


        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        Files.copy(screenshot , new File("/Users/aditya/Desktop/Screenshot\\ 2023-05-11\\ at\\ 9.53.15\\ AM.png"));








    }
}
