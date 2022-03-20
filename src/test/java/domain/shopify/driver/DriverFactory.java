package domain.shopify.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory {


    public static WebDriver getBrovser(String browserName) {

        if (browserName == "chrome") {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        if (browserName == "firefox") {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        if (browserName == "opera") {
            WebDriverManager.operadriver().setup();
            return new OperaDriver();
        }

        return null;
    }

}

