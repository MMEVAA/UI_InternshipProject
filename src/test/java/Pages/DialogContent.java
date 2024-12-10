package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


    // 5

    @FindBy(xpath = "//*[@class='mat-mdc-tooltip-trigger mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base']")
    public WebElement newMessage;

    @FindBy(xpath = "(//mat-checkbox)[3]")
    public WebElement addReceiver;

    @FindBy (xpath = "//*[@icon='envelope']")
    public WebElement sendEmail;

    @FindBy (xpath = "//ms-button/button/span[2]")
    public WebElement addReceivers;

    @FindBy (xpath = "(//*[@class='mdc-button__label'])[17]")
    public WebElement addClose;

    @FindBy (xpath = "//*[text()='Send also via']")
    public WebElement sendVia;

    @FindBy (xpath = "//*[@value='EMAIL']")
    public WebElement eMail;

    @FindBy (xpath = "//*[@placeholder='Subject']")
    public WebElement subject;

    @FindBy (xpath = "//*[@id='tinymce']")
    public WebElement space;

    @FindBy (xpath = "//*[text()='Attach Files...']")
    public WebElement attachFiles;

    @FindBy (xpath = "(//ms-button/button)[4]")
    public WebElement send;


    @FindBy (xpath = "//*[text()='Outbox']")
    public WebElement outbox;

    // 8

    @FindBy (xpath = "(//*[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement finance;

    @FindBy (xpath = "//*[text()='My Finance']")
    public WebElement myFinance;








}
