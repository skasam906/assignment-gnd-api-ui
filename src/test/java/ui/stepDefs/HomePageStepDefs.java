package ui.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import ui.stepLibs.HomePageStepLibs;

public class HomePageStepDefs {

    @Steps
    HomePageStepLibs homePageStepLibs;

    @Given("user is on the Modern Store home page")
    public void userNavigatesToHomePage() {
        homePageStepLibs.navigateToHomePage();
    }

    @When("clicks on MEN on the primary menu items black label")
    public void clickMenItem() {
        homePageStepLibs.clickMenuItemMen();
    }

    @Then("user is successfully navigated to MEN category")
    public void verifyMenCategory() {
        homePageStepLibs.verifyCategoryIsMen();
    }
}
