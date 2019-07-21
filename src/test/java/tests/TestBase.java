package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.*;


public class TestBase{

    public static WebDriver driver;
    public HomePage homePage;
    public ProjectPage projectPage;
    public PlaygroundPage playgroundPage;
    public PeoplePage peoplePage;
    public CreateUserPage createUserPage;

    @BeforeSuite
    @Parameters({"Browser"})
    public void startDriver(@Optional("chrome") String BrowserName) {
        if (BrowserName.equalsIgnoreCase ("Firefox")) {
            System.setProperty ("webdriver.gecko.driver", System.getProperty ("user.dir") + "\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver ();
        } else if (BrowserName.equalsIgnoreCase ("chrome")) {
            System.setProperty ("webdriver.chrome.driver", System.getProperty ("user.dir") + "\\drivers\\chromedriver2.38.exe");
            driver = new ChromeDriver ();
        }


    }

    @AfterSuite
    public void stopDriver()
    {
        driver.quit();
    }
}
