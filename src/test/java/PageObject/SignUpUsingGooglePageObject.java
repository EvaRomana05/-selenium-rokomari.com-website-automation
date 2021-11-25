package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpUsingGooglePageObject extends PageObject{

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    public WebElement signInButton;

    //tagname[@attribute = 'value']
    @FindBy(xpath = "//button[@class = 'btn btn-social-google']")
    public WebElement googleButton;

    @FindBy(xpath = "//input[@type = 'email']")
    public WebElement email;

    @FindBy(xpath = "//button[@class = 'VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b']")
    public WebElement nextButton;

    @FindBy(xpath = "//input[@type = 'password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class = 'VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b']")
    public WebElement nextButton2;


//
//    @FindBy(xpath = "//input[@id='email']")
//    public WebElement passWord;

    public SignUpUsingGooglePageObject(WebDriver driver) {
        super(driver);
    }
}
