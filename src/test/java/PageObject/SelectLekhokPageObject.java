package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectLekhokPageObject extends PageObject {

    @FindBy(xpath = "//a[@id='js--authors']")
    public WebElement writer;

    @FindBy(xpath = "//ul[@id='js--authors-menu']/div[1]/div[1]/li[1]/a")
    public WebElement humayanAhmed;

    @FindBy(xpath = "//label[contains(text(),'সমকালীন উপন্যাস')]")
    public WebElement somokalinUpponnash;

    @FindBy(xpath = "//label[contains(text(),'রচনা সংকলন ও সমগ্র')]")
    public WebElement rochonaSongkolon;

    @FindBy(xpath = "//a[contains(text(),'Next')]")
    public  WebElement nextButtom;

    @FindBy(xpath = "//div[@class='browse__content-books-wrapper']/div[@class='row']/div[1]")
    public WebElement book1;

    @FindBy(xpath = "//div[@class='browse__content-books-wrapper']/div[@class='row']/div[1]/div[1]/a[1]/div[1]/div[1]/button[@class='btn cart-btn js--add-to-cart' and contains(text(),'Add to Cart')]")
    public WebElement book1AddToCurtButton;

    @FindBy(xpath = "//div[@class='browse__content-books-wrapper']/div[@class='row']/div[3]")
    public WebElement book3;
    @FindBy(xpath = "//div[@class='browse__content-books-wrapper']/div[@class='row']/div[3]/div[1]/a[1]/div[1]/div[1]/button[@class='btn cart-btn js--add-to-cart' and contains(text(),'Add to Cart')]")
    public WebElement book3AddToCurtButton;

//    @FindBy(xpath = "//div[@class='browse__content-books-wrapper']/div[@class='row']/div[5]")
//    public WebElement book5;

//    @FindBy(xpath = "//div[@class='browse__content-books-wrapper']/div[@class='row']/div[5]/div[1]/a[1]/div[1]/div[1]/button[@class='btn cart-btn js--add-to-cart' and contains(text(),'Add to Cart')]")
//    public WebElement book5AddToCurtButton;

    @FindBy(xpath = "//*[@id='cart-icon']")
    public WebElement cartIcon;

    @FindBy(xpath = "//a[@id='js-continue-to-shipping']")
    public WebElement gotoShippingPage;

    @FindBy(xpath = "//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/fieldset[1]/input[1]")
    public WebElement enterPhoneNo;

    @FindBy(xpath = "//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/fieldset[2]/input[1]")
    public WebElement alternativePhoneNo;

//    @FindBy(xpath = "//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[2]/fieldset[1]/select[1]/option[4]")
//    public WebElement drpCountry;

    @FindBy(xpath = "//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/fieldset[2]/textarea[1]")
    public WebElement address;

    @FindBy(xpath = "//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[1]/label[1]")
    public WebElement radioButton;

    @FindBy(xpath = "//select[@id='js--country']")
    public WebElement drpCountry;

    @FindBy(xpath= "//select[@id='js--city']")
    public WebElement city;



    public SelectLekhokPageObject(WebDriver driver) {
        super(driver);
    }
}
