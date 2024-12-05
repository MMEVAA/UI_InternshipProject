package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _02_HomeSteps {
    DialogContent dc=new DialogContent();
    @And("The user should see the company logo in the top left")
    public void theUserShouldSeeTheCompanyLogoInTheTopLeft() {
        dc.myClick(dc.logo);

        dc.wait.until(ExpectedConditions.urlContains("https://test.mersys.io/"));
        String strUrl="https://test.mersys.io/";
        String url=GWD.getDriver().getCurrentUrl();
        Assert.assertEquals(url,strUrl);

    }
}
