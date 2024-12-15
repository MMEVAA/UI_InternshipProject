package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class _12_HamMenuFinance {

    DialogContent dc = new DialogContent();

    @Given("Click on the report menu")
    public void clickOnTheReportMenu() {

        dc.myClick(dc.reportMenu);

    }

    @When("Download payment report")
    public void downloadPaymentReport() throws InterruptedException {

        dc.myClick(dc.excelReport);


    }
}
