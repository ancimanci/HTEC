package pages;

import util.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PageBase{

    public static final String TEST_URL = "https://qa-sandbox.apps.htec.rs/login";
    public WebDriver driver;

    protected PageBase(WebDriver driver) {
        this.driver = driver;
    }

    public void quit() {
        if (this.driver != null) {
            driver.quit();
        }
    }



    public void assertElementIsDisplayed(By locator) {

        Assert.assertTrue(WebDriverUtil.isElementDisplayed(driver, locator));

    }



}
