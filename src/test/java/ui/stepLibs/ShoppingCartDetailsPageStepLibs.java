package ui.stepLibs;

import net.serenitybdd.annotations.Step;
import org.junit.Assert;
import ui.pages.ShoppingCartDetailsPage;

public class ShoppingCartDetailsPageStepLibs {

    ShoppingCartDetailsPage shoppingCartDetailsPage;

    @Step("verify item quantity ")
    public void verifyItemQuantity(String quantity) {
        Assert.assertTrue("Quantity of item on shopping cart doesn't match",
                shoppingCartDetailsPage.getQuantityOfItems().contains(quantity));
    }

    @Step("update shipping address and checkout")
    public void changeShippingAddress(String country, String state, String city, String postcode) {
        shoppingCartDetailsPage.updateShippingAddress(country, state, city, postcode);
    }

    @Step("verify shipping address is updated")
    public void verifyShippingAddress(String country, String state, String city, String postcode) {
        shoppingCartDetailsPage.getShippingAddress();
        shoppingCartDetailsPage.getShippingAddress();
        shoppingCartDetailsPage.getShippingAddress();
        Assert.assertTrue("Shipping address update  was unsuccessfully",
                shoppingCartDetailsPage.getShippingAddress().contains("Shipping to " + postcode + " " + city));
    }

    @Step("proceed to checkout")
    public void proceedToCheckOutOrder() {
        shoppingCartDetailsPage.checkOutOrder();
    }


}
