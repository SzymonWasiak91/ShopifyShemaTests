package tests;

import domain.shopify.driver.DriverManager;
import domain.shopify.pages.UpMenu;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.sql.DriverManager.drivers;
import static java.sql.DriverManager.getDriver;
import static org.testng.Assert.assertTrue;

public class BaseTest {
       protected WebDriver driver;

        @BeforeMethod
        public void setUP(){
                DriverManager driverManager = new DriverManager();
                driver = driverManager.getDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.get("https://simpletheme.myshopify.com");

        }

        @AfterMethod
        public void thereDown(){


        }


}
