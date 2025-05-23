package ui.stepDefs;

import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import ui.stepLibs.CheckoutPageStepLibs;

public class CheckoutPageStepDefs {

    @Steps
    CheckoutPageStepLibs checkoutPageStepLibs;

    @Then("verify checkout message {string}")
    public void verifyCheckoutMessage(String expectedMessage) {
        checkoutPageStepLibs.verifyCheckoutMessage(expectedMessage);
    }

}



