package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebDriverUtil {

    /**
     *
     * @param driver  - WebDriver instance
     * @param time    in seconds
     * @param locator - By instance
     * @return
     */
    public static WebElement waitForVisible(WebDriver driver, long time, By locator) {
        return new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement findElement(WebDriver driver, By locator) {
        return driver.findElement(locator);
    }

    public static List<WebElement> findElements(WebDriver driver, By locator) {
        return driver.findElements(locator);
    }


    public static boolean isElementDisplayed(WebDriver driver, By locator) {
        return findElements(driver, locator)
                .stream()
                .filter(WebElement::isDisplayed)
                .findFirst()
                .isPresent();
    }

    public static void clickOnElement(WebDriver driver, By locator) {
        findElement(driver, locator).click();
    }

    public static void populateField(WebDriver driver, By locator, String text) {
        findElement(driver, locator).sendKeys(text);
    }

}
