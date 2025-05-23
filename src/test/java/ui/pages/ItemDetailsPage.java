package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ItemDetailsPage extends BasePage {

    private final By menuItemHome = By.name("Home");
    private final By itemQuantity = By.name("quantity");
    private final By addToCart = By.name("add-to-cart");
    private final By addCartSuccessfulMessage = By.className("woocommerce-message");
    private final By visitShoppingCart = By.xpath("//div[@id='shopping-cart-container']/div/a/i");


    public ItemDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void updateQuantity(String quantity) {
        typeInto(itemQuantity, quantity, Duration.ofSeconds(3));
    }

    public void addToCart() {
        clickOn(addToCart, Duration.ofSeconds(3));
    }

    public String getAddCartSuccessMessage() {
        isElementDisplayed(addCartSuccessfulMessage, Duration.ofSeconds(3));
        return getTextFromElement(addCartSuccessfulMessage, Duration.ofSeconds(3));
    }

    public void visitShoppingCartPage() {
        clickOn(visitShoppingCart, Duration.ofSeconds(3));
    }

}

