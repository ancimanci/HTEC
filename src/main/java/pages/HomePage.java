package pages;

import org.openqa.selenium.By;


import util.WebDriverUtil;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {


    public By Loginname = By.xpath("//*[@name='email']");
    public By Password = By.xpath("//input[@name='password']");
    public By Submitlogin = By.xpath("//*[contains(@class,'btn')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {

        driver.get(TEST_URL);
        driver.manage().window().maximize();
        WebDriverUtil.waitForVisible(driver, 5, Loginname);
    }

    public void login() {
        WebDriverUtil.waitForVisible(driver, 10,  Submitlogin);
        String username = "andjelka.brkic@gmail.com";
        String password = "andjelka1";
        WebDriverUtil.populateField(driver, Loginname, username);
        WebDriverUtil.populateField(driver, Password, password);
        WebDriverUtil.clickOnElement(driver, Submitlogin);


    }
}
