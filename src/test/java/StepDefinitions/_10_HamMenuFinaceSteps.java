package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _10_HamMenuFinaceSteps {
    DialogContent dc=new DialogContent();
    @Given("Navigate to My Finance")
    public void navigateToMyFinance() {
        dc.myClick(dc.hammburgerMenu);
        dc.HoverOver(dc.finance);
        dc.myClick(dc.myFinance);
        dc.myClick(dc.userView);


    }

    @When("Checks that Online Payment and Fee Balance Details buttons are visible on the payment page")
    public void checksThatOnlinePaymentAndFeeBalanceDetailsButtonsAreVisibleOnThePaymentPage() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.onlinePayment));
        Assert.assertTrue(dc.onlinePayment.isDisplayed());
        Assert.assertTrue(dc.feeBalanceDetail.isDisplayed());

    }

    @Then("Making Payment via Stripe")
    public void makingPaymentViaStripe() {
    }

    @And("Balance Update and Visibility")
    public void balanceUpdateAndVisibility() {
    }

    @Then("Successful Payment Message")
    public void successfulPaymentMessage() {
    }
}
