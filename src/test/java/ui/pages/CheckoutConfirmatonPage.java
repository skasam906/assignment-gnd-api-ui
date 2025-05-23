package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CheckoutConfirmatonPage extends BasePage {

    private final By menuItemHome = By.name("Home");

    private final By checkOutErrorMessage = By.xpath("//div[@id='sub-frame-error-details']");
    private final By checkOutErrorMessageBody = By.xpath("//div[@id='sub-frame-error']");

    public CheckoutConfirmatonPage(WebDriver driver) {
        super(driver);
    }

    public String getCheckoutMessage() {
        mouseOverOnElement(checkOutErrorMessageBody);
        return getTextFromElement(checkOutErrorMessage, Duration.ofSeconds(3));
    }
}

