package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.net.URL;
ec
public class HelperClass {
    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
    public static String remote_url = "http://localhost:4444";
    @BeforeMethod
    public void setDriver() throws MalformedURLException, InterruptedException, java.net.MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        driver.set(new RemoteWebDriver(new URL(remote_url), options));
        driver.get().get("https://opensource-demo.orangehrmlive.com/");
        driver.get().manage().window().maximize();
        Thread.sleep(1000);

    }
    public WebDriver getDriver() {
        return driver.get();
    }
    @AfterMethod
    public  void closeBrowser() {
        driver.get().quit();
        driver.remove();
    }


}
