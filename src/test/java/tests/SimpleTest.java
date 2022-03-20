package tests;

import domain.shopify.pages.UpMenu;
import org.testng.annotations.Test;

public class SimpleTest extends BaseTest{
    @Test
    public void firstTest(){
        UpMenu upMenu = new UpMenu(driver);
        upMenu.searchItem("jeans");
    }
    @Test
    public void secendTest(){
        UpMenu upMenu = new UpMenu(driver);
        upMenu.searchItem("kuciapka");

    }
    @Test
    public void thirdTest(){
        UpMenu upMenu = new UpMenu(driver);
        upMenu.searchItem("pants");

    }
}
