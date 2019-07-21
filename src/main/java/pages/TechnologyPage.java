package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.WebDriverUtil;

import static util.WebDriverUtil.clickOnElement;

public class TechnologyPage extends PageBase {
    public By Technologycreate = By.xpath("//a[contains(@href,'create-technology')]");
    public TechnologyPage(WebDriver driver) {
        super(driver);
    }



    public void creationTechnology() {
        WebDriverUtil.waitForVisible(driver, 5, Technologycreate);
        clickOnElement(driver,Technologycreate);
    }
}