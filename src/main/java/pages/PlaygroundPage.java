package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.WebDriverUtil;


import util.WebDriverUtil;
import org.openqa.selenium.WebDriver;

public class PlaygroundPage extends PageBase {


    public By Technology = By.xpath("//a[contains(@href,'technologies')]");
    public By Seniorities = By.xpath("//input[@name='password']");
    public By People = By.xpath("//a[contains(@href,'people')]");

    public PlaygroundPage(WebDriver driver) {
        super(driver);
    }

    public void openTechnologies(){
        WebDriverUtil.waitForVisible(driver, 5, Technology);
        WebDriverUtil.clickOnElement(driver, Technology);
    }
    public void openPeople(){

        WebDriverUtil.clickOnElement(driver, People);

    }
}
