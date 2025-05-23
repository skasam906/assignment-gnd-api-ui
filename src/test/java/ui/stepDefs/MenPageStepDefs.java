package ui.stepDefs;

import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import ui.stepLibs.MenPageStepLibs;

public class MenPageStepDefs {

    @Steps
    MenPageStepLibs menPageStepLibs;

    @When("select sort by option average rating")
    public void selectSortBy() {
        menPageStepLibs.selectSortBy();
    }

    @When("select the item Yellow Hoodie")
    public void selectItem() {
        menPageStepLibs.selectYellowHoodieItem();
    }

}



