package api.stepDefs;

import api.stepLibs.AuthSteps;
import api.stepLibs.BookingSteps;
import api.utils.APIUtilityClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;


public class BookerStepDefs {

    static String firstName = null;
    static String lastName = null;
    static String totalPrice = null;
    static String depositPaid;
    static String additionalNeeds;
    static String checkIn;
    static String checkOut;
    static String token;
    static int id;

    @Steps
    BookingSteps bookingSteps;
    @Steps
    AuthSteps authSteps;

    @Given("user create a token for booking providing username {string} password {string}")
    public void createTokenProvidingUsernamePassword(String username, String password) {
        ValidatableResponse response = authSteps.createToken(username, password);
        token = response.extract().path("token");
    }

    @Then("create a new booking providing {string} {string} {string} {string} {string} {string} {string}")
    public void createNewBookingProviding(String firstName, String lastName, String totalPrice, String depositPaid, String additionalNeeds, String checkIn, String checkOut) {
        BookerStepDefs.firstName = APIUtilityClass.getRandomValue() + firstName;
        BookerStepDefs.lastName = APIUtilityClass.getRandomValue() + lastName;
        BookerStepDefs.totalPrice = APIUtilityClass.getRandomValue() + totalPrice;
        BookerStepDefs.additionalNeeds = additionalNeeds;
        BookerStepDefs.depositPaid = depositPaid;
        ValidatableResponse response = bookingSteps.createBooking(token, BookerStepDefs.firstName, BookerStepDefs.lastName, BookerStepDefs.totalPrice, depositPaid, additionalNeeds, checkIn, checkOut);
        id = response.extract().path("bookingid");
    }

    @Then("verify that the booking is created successfully")
    public void verifyThatBookingCreatedSuccessfully() {
        ValidatableResponse response = bookingSteps.getBookingByFirstName(id);
        Assert.assertTrue("First name mismatched with booking details", response.extract().path("firstname").toString().contains(firstName));
        Assert.assertTrue("Last name mismatched with booking details", response.extract().path("lastname").toString().contains(lastName));
        Assert.assertTrue("Deposit paid status mismatched with booking details", response.extract().path("depositpaid").toString().contains(depositPaid));
        Assert.assertTrue("Additional needs mismatched with booking details", response.extract().path("additionalneeds").toString().contains(additionalNeeds));
    }


    @When("user delete the booking")
    public void deleteBooking() {
        bookingSteps.deleteBooking(id);
    }

    @Then("verify that the booking is deleted successfully")
    public void verifyBookingDeletedSuccessfully() {
        bookingSteps.getBookingById(id);
    }
}
