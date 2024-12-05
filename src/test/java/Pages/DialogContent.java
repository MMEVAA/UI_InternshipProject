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

    // 5

    @FindBy(xpath = "(//*[@class='mat-badge mat-badge-accent mat-badge-above mat-badge-after mat-badge-small'])[2]")
    public WebElement messageBox;

    @FindBy(xpath = "(//*[@type=\"checkbox\"])[3]")
    public WebElement addReceiver;



}
