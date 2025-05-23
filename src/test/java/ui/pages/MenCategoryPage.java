package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class MenCategoryPage extends BasePage {

    private final By menuItemHome = By.name("Home");

    private final By pageHeader = By.xpath("//*[@id='loop-container']/h1");
    private final By sortBySelect = By.name("orderby");//By.xpath("//div[@id='loop-container']/form/select");
    private final By yellowHoodie = By.xpath("//img[@alt='Yellow Hoodie']");
    private final By itemQuantity = By.name("quantity");
    private final By addToCart = By.name("add-to-cart");


    public MenCategoryPage(WebDriver driver) {
        super(driver);
    }


    public void selectMenuItemHome() {
        clickOn(menuItemHome, Duration.ofSeconds(3));
    }

    public String getPageHeader() {
        isElementDisplayed(pageHeader, Duration.ofSeconds(3));
        return getTextFromElement(pageHeader, Duration.ofSeconds(3));
    }

    public void selectSortBy(String value) {
        selectValueFromDropDown(sortBySelect, value);
    }

    public void selectYellowHoodie() {
        clickOn(yellowHoodie, Duration.ofSeconds(3));
    }

}

