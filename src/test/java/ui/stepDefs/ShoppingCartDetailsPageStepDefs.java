package ui.stepDefs;

import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import ui.stepLibs.ShoppingCartDetailsPageStepLibs;

public class ShoppingCartDetailsPageStepDefs {

    @Steps
    ShoppingCartDetailsPageStepLibs shoppingCartDetailsPageStepLibs;

    @Then("verify quantity of item is {string}")
    public void navigateToShoppingCartPage(String quantity) {
        shoppingCartDetailsPageStepLibs.verifyItemQuantity(quantity);
    }

    @Then("update shipping address {string} {string} {string} {string}")
    public void changeShippingAddress(String country, String state, String city, String postcode) {
        shoppingCartDetailsPageStepLibs.changeShippingAddress(country, state, city, postcode);
    }

    @Then("verify shipping address got updated {string} {string} {string} {string}")
    public void verifyShippingAddress(String country, String state, String city, String postcode) {
        shoppingCartDetailsPageStepLibs.verifyShippingAddress(country, state, city, postcode);
    }


    @Then("proceed to checkout the order")
    public void proceedCheckOut() {
        shoppingCartDetailsPageStepLibs.proceedToCheckOutOrder();
    }


}



