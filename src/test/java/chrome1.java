import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome1 {



        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "/Users/aditya/Downloads/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/login/");



    }


}
