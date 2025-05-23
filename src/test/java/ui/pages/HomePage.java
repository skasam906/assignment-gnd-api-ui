package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class HomePage extends BasePage {

    private final By menuItemHome = By.name("Home");
    private final By menuItemMen = By.xpath("//a[contains(text(),'Men')]");
    private final By menuItemWomen = By.name("Women");
    private final By menuItemDenim = By.name("Denim");
    private final By menuItemNewArrivals = By.name("New Arrivals");


    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void selectMenuItemHome() {
        clickOn(menuItemHome, Duration.ofSeconds(3));
    }

    public void selectMenuItemMen() {
        clickOn(menuItemMen, Duration.ofSeconds(3));
    }

    public void selectMenuItemWomen() {
        clickOn(menuItemWomen, Duration.ofSeconds(3));
    }

}

