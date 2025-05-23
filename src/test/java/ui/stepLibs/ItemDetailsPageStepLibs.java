package ui.stepLibs;

import net.serenitybdd.annotations.Step;
import org.junit.Assert;
import ui.pages.ItemDetailsPage;

public class ItemDetailsPageStepLibs {

    ItemDetailsPage itemDetailsPage;


    @Step("update quantity of item ")
    public void updateItemQuantity(String quantity) {
        itemDetailsPage.updateQuantity(quantity);
    }

    @Step("Click on add to cart ")
    public void clickOnAddToCart() {
        itemDetailsPage.addToCart();
        Assert.assertTrue("Add Item to cart was unsuccessfully",
                itemDetailsPage.getAddCartSuccessMessage().contains("10 × “Yellow Hoodie” have been added to your cart."));

    }

    @Step("visit shopping cart page ")
    public void navigateToShoppingCart() {
        itemDetailsPage.visitShoppingCartPage();
    }

}
