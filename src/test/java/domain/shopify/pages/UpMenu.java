package domain.shopify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertTrue;

public class UpMenu {
    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchField;
    @FindBy(css = "#shopify-section-header > div.site-wrapper > div > div.grid__item.medium-up--one-fifth.small--one-half > div > form > button > svg")
    private WebElement searchButton;
    @FindBy(xpath = "//*[@id='MainContent']/h1")
    private WebElement assertTxt;
    private WebDriver driver;

    public UpMenu(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void searchItem(String item){
        searchField.click();
        searchField.clear();
        searchField.sendKeys(item);
        searchButton.click();
        String errorElementExpected = assertTxt.getText();
        System.out.println(errorElementExpected);
        assertTrue(errorElementExpected.contains(item));

    }

}
