package domain.shopify.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverManager {
    private static WebDriver driver;



    public static WebDriver getDriver() {
        if (driver == null) {
            driver = DriverFactory.getBrovser("chrome");
        }
        return driver;
    }
}
