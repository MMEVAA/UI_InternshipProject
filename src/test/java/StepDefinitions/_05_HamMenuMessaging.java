package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _05_HamMenuMessaging {

    DialogContent dc = new DialogContent();

    @Given("Click on the new message icon")
    public void clickOnTheNewMessageIcon() {

        dc.myClick(dc.newMessage);

    }

    @When("Click send message")
    public void clickSendMessage() {

        dc.myClick(dc.sendEmail);

    }

    @Then("Click add recipient and select recipients")
    public void clickAddRecipientAndSelectRecipients() {

        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.addReceivers));
        dc.myClick(dc.addReceivers);
        dc.myClick(dc.addReceiver);
        dc.myClick(dc.addClose);

    }

    @And("Add medium, topic, message, file and send")
    public void addMediumTopicMessageFileAndSend() {

        dc.myClick(dc.subject);
        dc.mySendKeys(dc.subject, "Proje");
        GWD.getDriver().switchTo().frame(0);
        dc.myClick(dc.space);
        dc.mySendKeys(dc.space, "Proje");
        GWD.getDriver().switchTo().parentFrame();
        dc.myClick(dc.attachFiles);
        dc.myJsClick(dc.send);

    }

    @Then("Go to outbox and check your message")
    public void goToOutboxAndCheckYourMessage() {

        dc.myClick(dc.hammburgerMenu);
        dc.HoverOver(dc.messaging);
        dc.myClick(dc.outbox);


    }
}
