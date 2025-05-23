package ui.stepLibs;

import net.serenitybdd.annotations.Step;
import org.junit.Assert;
import ui.pages.CheckoutConfirmatonPage;

public class CheckoutPageStepLibs {

    CheckoutConfirmatonPage checkoutConfirmatonPage;

    @Step("verify checkout message ")
    public void verifyCheckoutMessage(String message) {
        Assert.assertTrue("Checkout message was unsuccessfully",
                checkoutConfirmatonPage.getCheckoutMessage().contains(message));
    }


}
