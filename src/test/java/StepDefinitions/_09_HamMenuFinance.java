package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class _09_HamMenuFinance {

    DialogContent dc = new DialogContent();

    @Given("The user clicks on the hamburger menu")
    public void clickOnTheHamburgerMenu() {
        dc.myClick(dc.hammburgerMenu);
    }

    @When("The user clicks on the \"Finance\" link in the hamburger menu")
    public void goToFinanceLink() {
        dc.HoverOver(dc.finance);
    }

    @Then("The user clicks on the \"My Finance\" button")
    public void clickOnMyFinanceButton() {
        dc.myClick(dc.myFinance);
    }

    @And("The finance page should be displayed")
    public void verifyPageDisplayed() {

        dc.wait.until(ExpectedConditions.urlContains("https://test.mersys.io/student-finance/active"));
        String strUrl = "https://test.mersys.io/student-finance/active";
        String url = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals(url, strUrl);

    }

    @When("Clicking on the student finance page")
    public void clickOnStudentFinance() {
        dc.myClick(dc.userView);
    }

    @Then("The user clicks on the FeeBalance Detail button")
    public void clickOnTheFeeBalanceDetailButton() {
        dc.myClick(dc.feeBalanceDetail);
    }

    @And("The user should see their payment installment details")
    public void verifyInstallmentPage() {
        Assert.assertTrue(dc.feeBalanceDetail.isDisplayed());
    }

}
