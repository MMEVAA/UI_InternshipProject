package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.GWD;

import java.time.Duration;

public class _13_AttendanceExcecuses {

    WebDriver driver = GWD.getDriver();
    DialogContent dc = new DialogContent();

    @Given("Navigate to Attendance")
    public void navigateToAttendance() {

        dc.myClick(dc.attendance);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.attendance));
    }

    @When("Click Attendance Excuses and add Attendance Excuses button")
    public void clickAttendanceExcusesAndAddAttendanceExcusesButton() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(dc.attendanceExcuses)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dc.addAttendanceExcuses)).click();


        WebDriverWait overlayWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement overlay = driver.findElement(By.cssSelector(".cdk-overlay-backdrop"));
            overlayWait.until(ExpectedConditions.invisibilityOf(overlay));
        } catch (Exception e) {

            System.out.println("Overlay bulunamadı veya kayboldu.");
        }


        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='mat-ripple mat-mdc-tab-ripple'])[3]")));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }

    @Then("Send the my excuses")
    public void sendTheMyExcuses() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.messageBox));
        dc.myClick(dc.messageBox);

        dc.mySendKeys(dc.messageBox, "Hastalandığım için derse katılamadım");
        dc.myClick(dc.sendBox);
    }
}
