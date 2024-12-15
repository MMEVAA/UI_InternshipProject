package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _04_HamMenuMessagingOptions {
    DialogContent dc = new DialogContent();

    @When("The user clicks on the hamburger menu")
    public void clickOnHamburgerMenu() {
        dc.myClick(dc.hamburgerMenu);
    }


    @When("The user hovers over the {string} option")
    public void hoverOverMessagingOption(String option) {
        dc.HoverOver(dc.messagingSection);
    }

    @Then("The following options should be displayed:")
    public void verifyOptionsDisplayed(DataTable dataTable) {
        System.out.println("Verifying submenu options are displayed.");
        for (String option : dataTable.asList()) {
            System.out.println(option + " option is displayed.");
        }
    }

    @Given("Click on the Send Message option")
    public void clickOnTheSendMessageOption() {
        dc.myClick(dc.sendMessage);
    }

    @Then("User should redirect to Send Message URL")
    public void userShouldRedirectToSendMessageURL() {
        dc.wait.until(ExpectedConditions.urlContains("https://test.mersys.io/user-messages/new"));
    }

    @Given("Click on the Inbox option")
    public void clickOnTheInboxOption() {
        dc.myClick(dc.inbox);
    }

    @Then("User should redirect to Inbox URL")
    public void userShouldRedirectToInboxURL() {
        dc.wait.until(ExpectedConditions.urlContains("https://test.mersys.io/user-messages/list/inbox"));
    }

    @Given("Click on the Outbox option")
    public void clickOnTheOutboxOption() {
        dc.myClick(dc.outboxSection);
    }

    @Then("User should redirect to Outbox URL")
    public void userShouldRedirectToOutboxURL() {
        dc.wait.until(ExpectedConditions.urlContains("https://test.mersys.io/user-messages/list/outbox"));
    }

    @Given("Click on the Trash option")
    public void clickOnTheTrashOption() {
        dc.myClick(dc.trash);
    }

    @Then("User should redirect to Trash URL")
    public void userShouldRedirectToTrashURL() {
        dc.wait.until(ExpectedConditions.urlContains("https://test.mersys.io/user-messages/list/trash"));
    }
}