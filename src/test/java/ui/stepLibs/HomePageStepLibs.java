package ui.stepLibs;

import net.serenitybdd.annotations.Step;
import org.junit.Assert;
import ui.pages.HomePage;
import ui.pages.MenCategoryPage;

public class HomePageStepLibs {
    HomePage homePage;
    MenCategoryPage menCategoryPage;

    @Step("Navigate to Home page")
    public void navigateToHomePage() {
        homePage.openUnchecked();
        homePage.switchToFrame();
    }

    @Step("Click on MEN item")
    public void clickMenuItemMen() {
        homePage.selectMenuItemMen();
    }

    @Step("Verify user is navigated to the MEN category page")
    public void verifyCategoryIsMen() {
        String expectedPageHeader = "Men";
        Assert.assertTrue("User was unsuccessfully navigated to the MEN category page", menCategoryPage.getPageHeader().contains(expectedPageHeader));
    }


}
