package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _06_HamMenuMoveToTrashSteps {
    DialogContent dc = new DialogContent();

    @And("Click on the Move to Trash icon")
    public void clickOnTheMoveToTrashIcon() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.moveToTrashIcon));
        dc.myClick(dc.moveToTrashIcon);
    }

    @Then("User should see to confirm message")
    public void userShouldSeeToConfirmMessage() {
        dc.wait.until(ExpectedConditions.titleIs("\n" +
                "Confirm"));
    }

    @And("Click on the Yes button")
    public void clickOnTheYesButton() {
        dc.myClick(dc.confirmYesButton);
    }

    @Then("User should see to success delete message")
    public void userShouldSeeToSuccessDeleteMessage() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.successMessaging));
        Assert.assertTrue(dc.successMessaging.getText().contains("Message successfully moved to trash!"));
    }

    @And("Select to the new subject")
    public void selectToTheNewSubject() {
        dc.myClick(dc.selectedSubject);
    }
}