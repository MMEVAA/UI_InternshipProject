package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

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
        dc.myClick(dc.payAmount);
        dc.myClick(dc.pay);
        dc.myClick(dc.payButton);


    }

    @Then("Enter the payment amount and information and complete the payment.")
    public void enterThePaymentAmountAndInformationAndCompleteThePayment() {

        // Duration.ofSeconds(2);
        GWD.getDriver().switchTo().frame(0);
        // dc.wait.until(ExpectedConditions.invisibilityOf(dc.cardNumber));
        dc.mySendKeys(dc.cardNumber, "4242424242424242");
        dc.mySendKeys(dc.expDate, "0127");
        dc.mySendKeys(dc.securityCode, "333");
        GWD.getDriver().switchTo().parentFrame();
        dc.myClick(dc.payments);


    }
}
