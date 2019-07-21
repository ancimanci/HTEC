package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static util.WebDriverUtil.*;
import static util.WebDriverUtil.clickOnElement;
import static util.WebDriverUtil.waitForVisible;

public class PeoplePage extends pages.PageBase {
    public By PeopleCreate = By.xpath("//*[contains(@class,'btn-primary')]");
    public By users = By.xpath("//*[contains(@class,'list')]");
    public By username = By.name("people_name");
    public By Submit = By.xpath("//*[@type='submit']");
    public By Delete = By.xpath("//*[@type='button']");

    public PeoplePage(WebDriver driver) {
        super(driver);
    }


    public void creationPeople() {
        waitForVisible(driver, 5, PeopleCreate);
        clickOnElement(driver, PeopleCreate);
    }

    public void openUser(String user) {

        waitForVisible(driver, 5, PeopleCreate);
        List<WebElement> elements = findElements(driver, users);


        for (int i = 0; i < elements.size(); i++) {
            String name = elements.get(i).getText();
            if (user.equals(name)) {
                elements.get(i).click();
                break;
            }
        }
    }

}