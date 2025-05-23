package ui.stepDefs;

import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import ui.stepLibs.ItemDetailsPageStepLibs;

public class ItemDetailsPageStepDefs {

    @Steps
    ItemDetailsPageStepLibs itemDetailsPageStepLibs;

    @Then("update quantity of Hoodie to {string} and add items to cart")
    public void updateItemQuantity(String quantity) {
        itemDetailsPageStepLibs.updateItemQuantity(quantity);
        itemDetailsPageStepLibs.clickOnAddToCart();
    }

    @Then("navigate to shopping cart")
    public void navigateToShoppingCartPage() {
        itemDetailsPageStepLibs.navigateToShoppingCart();
    }
}



