package ui.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class BasePage extends PageObject {
    public BasePage(WebDriver driver) {
        super(driver);
        driver.manage().window().maximize();
    }

    // Common method to open a URL
    public void navigateTo(String url) {
        getDriver().get(url);
    }

    /**
     * Clicks on a web element located by the specified locator within a given timeout.
     *
     * @param locator the locator used to find the web element
     * @param timeout the maximum time to wait for the element to become clickable
     * @throws NoSuchElementException if the element cannot be found
     * @throws TimeoutException       if the element is not clickable within the specified timeout
     * @see By
     * @see Duration
     */
    // Common method to click on an element
    public void clickOn(By locator, Duration timeout) {
        $(locator).withTimeoutOf(timeout).click();
    }

    /**
     * checks if a web element is displayed on the page within a given timeout.
     *
     * @param locator the locator used to find the web element
     * @param timeout the maximum time to wait for the element to become displayed
     * @throws NoSuchElementException if the element cannot be found
     * @throws TimeoutException       if the element is not displayed within the specified timeout
     * @see By
     * @see Duration
     */
    // Common method to check if an element is displayed
    public boolean isElementDisplayed(By locator, Duration timeout) {
        return $(locator).withTimeoutOf(timeout).isDisplayed();
    }

    /**
     * checks if a web element is visible on the page within a given timeout.
     *
     * @param locator the locator used to find the web element
     * @param timeout the maximum time to wait for the element to become clickable
     * @throws NoSuchElementException if the element cannot be found
     * @throws TimeoutException       if the element is not clickable within the specified timeout
     * @see By
     * @see Duration
     */
    // Common method to check if an element is displayed
    public boolean isElementVisible(By locator, Duration timeout) {
        return $(locator).withTimeoutOf(timeout).isVisible();
    }

    /**
     * Enter text into a web element located by the specified locator within a given timeout.
     *
     * @param locator the locator used to find the web element
     * @param text    the text a user wants to enter into the web element
     * @param timeout the maximum time to wait for the element to become clickable
     * @throws NoSuchElementException if the element cannot be found
     * @throws TimeoutException       if the element is not clickable within the specified timeout
     * @see By
     * @see Duration
     */
    // Common method to type text into an element
    public void typeInto(By locator, String text, Duration timeout) {
        $(locator).withTimeoutOf(timeout).type(text);
    }

    /**
     * Enter text into a web element located by the specified locator within a given timeout.
     *
     * @param locator the locator used to find the web element
     * @param text    the text a user wants to enter into the web element
     * @param timeout the maximum time to wait for the element to become clickable
     * @throws NoSuchElementException if the element cannot be found
     * @throws TimeoutException       if the element is not clickable within the specified timeout
     * @see By
     * @see Duration
     */
    // Common method to type text into an element
    public void typeIntoUsingJavascriptExecutor(By locator, String text, Duration timeout) {
        // Use JavaScript to click the element
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].value='" + text + "';", $(locator).withTimeoutOf(timeout));

//        // Optionally, you can add some delay to see the click action
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        $(locator).withTimeoutOf(timeout).type(text);
    }

    // Common method to get text from an element
    public String getTextFromElement(By locator, Duration timeout) {
        mouseOverOnElement(locator);
        return $(locator).withTimeoutOf(timeout).getText();

    }

    // Common method to find an element by its locator
    public WebElementFacade find(By locator, Duration timeout) {
        return $(locator).withTimeoutOf(timeout);
    }

    // Custom wait for an element to be visible with a specific timeout
    public void waitForElementToBeVisible(By locator, Duration timeout) {
        $(locator).withTimeoutOf(timeout).waitUntilVisible();
    }

    // Custom wait for an element to be clickable with a specific timeout
    public void waitForElementToBeClickable(By locator, Duration timeout) {
        $(locator).withTimeoutOf(timeout).waitUntilClickable();
    }

    // Common method to get value from an element
    public String getValueFromElement(By locator, Duration timeout) {
        return $(locator).withTimeoutOf(timeout).getValue();
    }

    // Common method to select value from dropdown
    public void selectValueFromDropDown(By locator, String value) {
        find(locator).withTimeoutOf(Duration.ofSeconds(3)).selectByVisibleText(value);
    }

    // Common method to select iframe
    public void switchToFrame() {
        WebElement iFrame = getDriver().findElement(By.id("iframe"));
        getDriver().switchTo().frame(iFrame);
    }

    // Common method to wait for element (Fluent wait)
    public void fluentWaitForElement(By locator) {
        Wait<WebDriver> wait =
                new FluentWait<>(getDriver())
                        .withTimeout(Duration.ofSeconds(5))
                        .pollingEvery(Duration.ofMillis(300))
                        .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(locator));

    }

    // Common method to mouse over on element
    public void mouseOverOnElement(By locator) {
        Actions action = new Actions(getDriver());
        action.moveToElement($(locator)).build().perform();
    }
}
