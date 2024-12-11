package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;

public class _11_HamMenuFinance {

    DialogContent dc = new DialogContent();


    @Then("Click view icon")
    public void clickViewIcon() {

        dc.myClick(dc.userView);

    }

    @And("Click on Stripe and share icon")
    public void clickOnStripeAndShareIcon() {

        dc.myClick(dc.stripe);
        dc.myClick(dc.payAmount);
        dc.myClick(dc.pay);
        dc.mySendKeys(dc.amount, "235");
        new Actions(GWD.getDriver()).doubleClick(dc.payButton).perform();

    }

    @Then("Enter the payment amount and information and complete the payment.")
    public void enterThePaymentAmountAndInformationAndCompleteThePayment() throws InterruptedException {

        Thread.sleep(3000);
        GWD.getDriver().switchTo().frame(0);
        dc.mySendKeys(dc.cardNumber, "4242424242424242");
        dc.mySendKeys(dc.expDate, "0127");
        dc.mySendKeys(dc.securityCode, "333");
        GWD.getDriver().switchTo().parentFrame();
        dc.myClick(dc.payments);
        dc.LoginContainsText(dc.successMessage, "Student Payment successfully created");


    }
}
