package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.WebDriverUtil;

import static util.WebDriverUtil.clickOnElement;

public class ProjectPage extends PageBase{

    public By Project = By.xpath("//a[contains(@href,'projects')]");


    public ProjectPage(WebDriver driver) {
        super(driver);
    }

    // use anotation find by for page factory


    public void openProject()
    {
        WebDriverUtil.waitForVisible(driver, 2, Project);
        clickOnElement(driver, Project);
    }

}
