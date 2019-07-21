package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.WebDriverUtil;

import static util.WebDriverUtil.clickOnElement;
import static util.WebDriverUtil.waitForVisible;

public class EditUserPage extends PageBase {

    public By Delete = By.xpath ("//*[contains(@class,'btn-secondary ml-2')]");
    public By username = By.xpath ("//input[@type='text']");
    public By Submit = By.xpath ("//div//*[@value='Submit']");
    public By confirmdelete = By.xpath ("//*[contains(@class,'danger')]");

    public
    EditUserPage (WebDriver driver) {


        super (driver);
    }


    public
    void deleteUser () {
        waitForVisible (driver, 5, Delete);
        clickOnElement (driver, Delete);
        waitForVisible (driver, 5, confirmdelete);
        clickOnElement (driver, confirmdelete);
    }

    public
    void changeName (String changed) throws InterruptedException {
        waitForVisible (driver, 10, username);
        WebDriverUtil.findElement (driver, username).clear ();
        WebDriverUtil.findElement (driver, username).sendKeys (changed);
        waitForVisible (driver, 10, Submit);
        WebDriverUtil.clickOnElement (driver, Submit);
        Thread.sleep (1000);
    }

}