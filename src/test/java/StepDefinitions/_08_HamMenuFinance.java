package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _08_HamMenuFinance {

    DialogContent dc=new DialogContent();

    @Given("Click on the hamburger menu")
    public void clickOnTheHamburgerMenu() {

        dc.myClick(dc.hammburgerMenu);

    }

    @When("Go to Finance section")
    public void goToFinanceSection() {

        dc.HoverOver(dc.finance);

    }

    @Then("Click on my finance button")
    public void clickOnMyFinanceButton() {

        dc.myClick(dc.myFinance);


    }

    @And("View payment page")
    public void viewPaymentPage() {

        dc.wait.until(ExpectedConditions.urlContains("https://test.mersys.io/student-finance/active"));
        String strUrl="https://test.mersys.io/student-finance/active";
        String url= GWD.getDriver().getCurrentUrl();
        Assert.assertEquals(url,strUrl);

//        dc.LoginContainsText(dc.);
    }
}
