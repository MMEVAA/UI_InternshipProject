package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);

    }

    // 1

    @FindBy(xpath = "//*[@placeholder='Kullanıcı Adı']")
    public WebElement username;

    @FindBy(xpath = "//*[@placeholder='Parola']")
    public WebElement password;

    @FindBy(xpath = "//span[@class='mdc-button__label']")
    public WebElement loginButton;

    @FindBy(xpath = "(//*[text()='Internship'])[1]")
    public WebElement headText;

    //2
    @FindBy(xpath = "//mat-toolbar/div/div/div/div/img")
    public WebElement logo;

    //3

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


    //7
    @FindBy(xpath = "(//span/span/button/span[2]/fa-icon)[1]")
    public WebElement hammburgerMenu;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[1]")
    public WebElement messaging;

    @FindBy(xpath = "//span[text()='Trash']")
    public WebElement trash;

    @FindBy(xpath = "//ms-delete-button/button/span[2]")
    public WebElement trashDelete;

    @FindBy(css = "button[type='submit'] :nth-child(2)")
    public WebElement deleteButton;

    //Message successfully deleted
    @FindBy(xpath = "//mat-panel-description/div[text()='Message successfully deleted']")
    public WebElement deleteMessage;

    @FindBy(xpath = "//tbody//ms-standard-button[@icon='trash-restore']/button/span[2]")
    public WebElement restore;

    //Message successfully restored from trash
    @FindBy(xpath = "//mat-panel-description//div[text()='Message successfully restored from trash']")
    public WebElement restoreMessage;


    //10
    @FindBy(xpath = "(//ms-standard-button/button/span[2])[1]")
    public WebElement userView;

    @FindBy(xpath = "//div[@class='mat-mdc-tab-labels']/div/span[2]/span")
    public WebElement onlinePayment;

    @FindBy(xpath = "//div[@class='mat-mdc-tab-labels']/div[2]/span[2]/span")
    public WebElement feeBalanceDetail;

    @FindBy(xpath = "//*[@class='mdc-radio']")
    public WebElement stripe;


    // 5

    @FindBy(xpath = "//*[@class='mat-mdc-tooltip-trigger mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base']")
    public WebElement newMessage;

    @FindBy(xpath = "(//mat-checkbox)[3]")
    public WebElement addReceiver;

    @FindBy(xpath = "//*[@icon='envelope']")
    public WebElement sendEmail;

    @FindBy(xpath = "//ms-button/button/span[2]")
    public WebElement addReceivers;

    @FindBy(xpath = "(//*[@class='mdc-button__label'])[17]")
    public WebElement addClose;

    @FindBy(xpath = "//*[text()='Send also via']")
    public WebElement sendVia;

    @FindBy(xpath = "//*[@value='EMAIL']")
    public WebElement eMail;

    @FindBy(xpath = "//*[@placeholder='Subject']")
    public WebElement subject;

    @FindBy(xpath = "//*[@id='tinymce']")
    public WebElement space;

    @FindBy(xpath = "//*[text()='Attach Files...']")
    public WebElement attachFiles;

    @FindBy(xpath = "(//ms-button/button)[4]")
    public WebElement send;


    @FindBy(xpath = "//*[text()='Outbox']")
    public WebElement outbox;

    // 8

    @FindBy(xpath = "(//*[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement finance;

    @FindBy(xpath = "//*[text()='My Finance']")
    public WebElement myFinance;

    // 11

    @FindBy(xpath = "(//*[@class='mdc-radio'])[2]")
    public WebElement payAmount;

    @FindBy(xpath = "(//*[@class='mdc-radio'])[4]")
    public WebElement pay;

    @FindBy(xpath = "//*[@placeholder='Amount']")
    public WebElement amount;

    @FindBy(xpath = "(//*[@class='mdc-button__label'])[14]")     //*[@data-icon='wallet']
    public WebElement payButton;

    @FindBy(xpath = "//*[@placeholder='1234 1234 1234 1234']")    //*[@id='Field-numberInput']
    public WebElement cardNumber;

    @FindBy(xpath = "//*[@id='Field-expiryInput']")
    public WebElement expDate;

    @FindBy(xpath = "//*[@id='Field-cvcInput']")
    public WebElement securityCode;

    @FindBy(xpath = "//*[@class='stripe-img']")
    public WebElement payments;

    @FindBy(xpath = "//mat-panel-description/div")
    public WebElement successMessage;


}
