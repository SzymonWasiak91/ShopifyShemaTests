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

import static org.testng.Assert.assertTrue;

public class BaseTest {
        WebDriver driver;

        @BeforeMethod
        public void setUP(){
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.get("https://simpletheme.myshopify.com");
        }
        @Test
        public void firstTest(){
                WebElement serachField = driver.findElement(By.xpath("//input[@type='search']"));
                serachField.click();
                serachField.clear();
                String searchKey = "kutas";
                serachField.sendKeys(searchKey);
                WebElement buttonSearch = driver.findElement(By.cssSelector("#shopify-section-header > div.site-wrapper > div > div.grid__item.medium-up--one-fifth.small--one-half > div > form > button > svg"));
                buttonSearch.click();
                String errorElementExpected = driver.findElement(By.xpath("//*[@id='MainContent']/h1")).getText();
                System.out.println(errorElementExpected);
                assertTrue(errorElementExpected.contains(searchKey));

        }
        @Test
        public void secendTest(){
                WebElement serachField = driver.findElement(By.xpath("//input[@type='search']"));
                serachField.click();
                serachField.clear();
                String searchKey = "jeans";
                serachField.sendKeys(searchKey);
                WebElement buttonSearch = driver.findElement(By.cssSelector("#shopify-section-header > div.site-wrapper > div > div.grid__item.medium-up--one-fifth.small--one-half > div > form > button > svg"));
                buttonSearch.click();
                String errorElementExpected = driver.findElement(By.xpath("//*[@id='MainContent']/h1")).getText();
                System.out.println(errorElementExpected);
                assertTrue(errorElementExpected.contains(searchKey));

        }
        @Test
        public void thirdTest(){
                WebElement serachField = driver.findElement(By.xpath("//input[@type='search']"));
                serachField.click();
                serachField.clear();
                String searchKey = "Pants";
                serachField.sendKeys(searchKey);
                WebElement buttonSearch = driver.findElement(By.cssSelector("#shopify-section-header > div.site-wrapper > div > div.grid__item.medium-up--one-fifth.small--one-half > div > form > button > svg"));
                buttonSearch.click();
                String errorElementExpected = driver.findElement(By.xpath("//*[@id='MainContent']/h1")).getText();
                System.out.println(errorElementExpected);
                assertTrue(errorElementExpected.contains(searchKey));

        }
        @AfterMethod
        public void thereDown(){
                driver.close();
                driver.quit();
        }


}
