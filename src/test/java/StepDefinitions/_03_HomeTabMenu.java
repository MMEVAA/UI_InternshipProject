package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class _03_HomeTabMenu {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @Given("The user verifies Header menu by clicking on the Header menu links")
    public void clickOnTheHeaderMenuLinks(DataTable dt) {

//        List<String> url = new ArrayList<>();
//        Collections.addAll(url, "Courses", "Calendar", "Attendance", "Assignment", "Grading");
//        List<String> links = dt.asList(String.class);
//        for (String link : links) {
//            System.out.println("? : " + ln.getWebElement(link).isDisplayed());
//            ln.myClick(ln.getWebElement(link));
// }

        dc.myClick(dc.calenderButton);
        assertTrue(dc.calenderButton.isDisplayed(), "Calendar button is not visible");
        dc.HoverOver(dc.calenderButton);

        dc.myClick(dc.attendanceButton);
        assertTrue(dc.attendanceButton.isDisplayed(), "Attendance button is not visible");

        dc.wait.until(ExpectedConditions.visibilityOf(dc.assigmentButton));
        dc.myClick(dc.assigmentButton);
        assertTrue(dc.assigmentButton.isDisplayed(), "Assignment button is not visible");

        dc.wait.until(ExpectedConditions.visibilityOf(dc.grandingButton));
//        dc.myClick(dc.grandingButton);
        dc.myJsClick(dc.grandingButton);
        assertTrue(dc.grandingButton.isDisplayed(), "Grading button is not visible");
    }

    @And("The user clicks on the Hamburger menu and Hamburger submenu")
    public void clickOnTheHamMenu() {

        dc.myClick(dc.HamMenuButton);
        assertTrue(dc.HamMenuButton.isDisplayed(), "Hamburger menu button is not visible");

    }

    @Then("The user verifies items in the upper right corner")
    public void verifyRightCornerItems() {

        dc.myClick(dc.announcementsButton);
        assertTrue(dc.announcementsButton.isDisplayed(), "Announcements button is not visible");

        dc.myClick(dc.newMessageButton);
        assertTrue(dc.newMessageButton.isDisplayed(), "New message button is not visible");

        dc.myClick(dc.myProfileIcon);
        assertTrue(dc.myProfileIcon.isDisplayed(), "Profile icon is not visible");


    }

}
