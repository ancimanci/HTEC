package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.WebDriverUtil;

public class CreateUserPage extends PageBase {
    public By Name = By.xpath("//input[@type='text']");
    public By Seniority = By.xpath("//*[contains(@placeholder,'seniority')]");
    public By Senioritet = By.xpath("//*[@role='option']");
    public By Technologies = By.xpath("//*[contains(@class,'multi')]");
    public By Technology = By.xpath("//*[@role='option']");
    public By UserSubmit = By.xpath("//div//*[@value='Submit']");
    public By PeopleCreate = By.className("btn-text");

    public CreateUserPage(WebDriver driver) {


        super(driver);
    }


    public void CreationUser(String name, String seniority, String technologies) {
        WebDriverUtil.populateField(driver, Name, name);
        WebDriverUtil.clickOnElement(driver, Seniority);
        WebDriverUtil.populateField(driver, Seniority, seniority);
        WebDriverUtil.clickOnElement(driver, Senioritet);
        String strArray[] = technologies.split(", ");

        for (int i = 0; i < strArray.length; i++) {
            technologies = strArray[i];


            WebDriverUtil.clickOnElement(driver, Technologies);
            WebDriverUtil.populateField(driver, Technologies, technologies);
            WebDriverUtil.clickOnElement(driver, Technology);
        }
        WebDriverUtil.clickOnElement(driver, UserSubmit);


    }


}

