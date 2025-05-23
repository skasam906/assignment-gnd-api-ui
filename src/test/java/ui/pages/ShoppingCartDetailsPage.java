package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ShoppingCartDetailsPage extends BasePage {

    private final By menuItemHome = By.name("Home");
    private final By visitShoppingCart = By.xpath("//div[@id='shopping-cart-container']/div/a/i");
    private final By itemQuantity = By.xpath("//div[@class='quantity']/input");
    private final By changeShippingAddress = By.linkText("Change address");
    private final By shippingCountry = By.name("calc_shipping_country");
    private final By shippingState = By.name("calc_shipping_state");
    private final By shippingCity = By.name("calc_shipping_city");
    private final By shippingPostcode = By.name("calc_shipping_postcode");
    private final By updateShippingAddress = By.name("calc_shipping");
    private final By checkoutOrder = By.xpath("//div[@class='wc-proceed-to-checkout']/a");
    private final By shippingAddress = By.xpath("//div[@class='cart_totals calculated_shipping']/table/tbody/tr[2]/td/p");


    public ShoppingCartDetailsPage(WebDriver driver) {
        super(driver);
    }

    public String getQuantityOfItems() {
        isElementDisplayed(itemQuantity, Duration.ofSeconds(3));
        return getValueFromElement(itemQuantity, Duration.ZERO);
    }

    public void updateShippingAddress(String country, String state, String city, String postcode) {
        clickOn(changeShippingAddress, Duration.ofSeconds(3));
        selectValueFromDropDown(shippingCountry, country);
        selectValueFromDropDown(shippingState, state);
        typeInto(shippingCity, city, Duration.ZERO);
        typeInto(shippingPostcode, postcode, Duration.ZERO);
        clickOn(updateShippingAddress, Duration.ofSeconds(3));
    }

    public void checkOutOrder() {
        fluentWaitForElement(checkoutOrder);
        clickOn(checkoutOrder, Duration.ofSeconds(3));

    }

    public String getShippingAddress() {
        fluentWaitForElement(shippingAddress);
        return getTextFromElement(shippingAddress, Duration.ofSeconds(3));
    }

    public void visitShoppingCartPage() {
        clickOn(visitShoppingCart, Duration.ofSeconds(3));
    }

}

