package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _07_HamMenuMessgSteps {
    DialogContent dc=new DialogContent();

    @Given("Navigate to Trash")
    public void navigateToTrash() {
        dc.myClick(dc.hammburgerMenu);
        dc.HoverOver(dc.messaging);
        dc.myClick(dc.trash);
    }

    @When("Click the delete button on the trash page")
    public void clickTheDeleteButtonOnTheTrashPage() {
        dc.myClick(dc.trashDelete);
        dc.myClick(dc.deleteButton);
    }

    @Then("User should delete successfully message")
    public void userShouldDeleteSuccessfullyMessage() {
        dc.LoginContainsText(dc.deleteMessage,"Message successfully deleted");
    }

    @And("Click the restore button on the trash page")
    public void clickTheRestoreButtonOnTheTrashPage() {
        dc.wait.until(ExpectedConditions.invisibilityOf(dc.deleteMessage));
        dc.myClick(dc.restore);
    }

    @Then("User should restore successfully message")
    public void userShouldRestoreSuccessfullyMessage() {
        dc.LoginContainsText(dc.restoreMessage,"Message successfully restored from trash");
    }
}
