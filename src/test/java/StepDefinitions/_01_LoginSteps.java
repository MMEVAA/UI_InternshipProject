package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _01_LoginSteps {

    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigateToCampus() {

        GWD.getDriver().get("https://test.mersys.io");

    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        dc.mySendKeys(dc.username, "Student_4");
        dc.mySendKeys(dc.password, "S12345");
        dc.myClick(dc.loginButton);

    }


    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {

        dc.LoginContainsText(dc.headText, "Internship");

    }
}
