package Pages;


import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LeftNav extends ParentPage {

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[2]")
    public WebElement calenderButton;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[3]/button/span[2]/span")
    public WebElement attendanceButton;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[4]/button/span[2]/span")
    public WebElement assigmentButton;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[5]/button/span[2]/fa-icon/svg")
    public WebElement grandingButton;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/span[1]/span/button/span[2]/fa-icon/svg")
    public WebElement HamMenuButton;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[2]/user-announcement-bell/button/span[2]")
    public WebElement announcementsButton;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[2]/user-message-bell/button/span[2]")
    public WebElement newMessageButton;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[2]/button/span[2]/div/user-image/img")
    public WebElement myProfileIcon;

    public WebElement getWebElement(String strElementName) {

        return switch (strElementName) {
            case "newMessageIcon" -> this.newMessageButton;
            case "gradingButton" -> this.grandingButton;
            case "calendarButton" -> this.calenderButton;
            case "attendanceButton" -> this.attendanceButton;
            case "assignmentsButton" -> this.assigmentButton;
            case "notificationsIcon" -> this.announcementsButton;
            default -> null;
        };
    }

}
