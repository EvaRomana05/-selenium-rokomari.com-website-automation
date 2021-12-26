package TestCases;

import BasicPackage.DriverSetUp;
import PageObject.SelectLekhokPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelectLekhok_TestCase_02 extends DriverSetUp {

    public static String baseUrl = "https://www.rokomari.com";

    @BeforeTest
    public static void PrerequisiteForTesting() throws InterruptedException {
        SignUpUsingGoogle_TestCase_01.signUp();
    }

    @Test
    public static void writer() throws InterruptedException {

        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        Thread.sleep(2000);

        // foGooglerLoginWork();

        SelectLekhokPageObject aSelectLekhokPageObject = new SelectLekhokPageObject(driver);
        Thread.sleep(2000);

        //Instantiating Actions class
        Actions actions = new Actions(driver);

        //Hovering on main menu
        actions.moveToElement(aSelectLekhokPageObject.writer).perform();
        Thread.sleep(2000);

        aSelectLekhokPageObject.humayanAhmed.click();
        Thread.sleep(2000);
        //humayanAhmed

        aSelectLekhokPageObject.somokalinUpponnash.click();
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(2000);

        aSelectLekhokPageObject.rochonaSongkolon.click();
        Thread.sleep(1000);
        System.out.println("Checked all Boxes..");

        JavascriptExecutor bjs = (JavascriptExecutor) driver;
        bjs.executeScript("window.scrollBy(0,5550)", "");
        Thread.sleep(2000);

        aSelectLekhokPageObject.nextButtom.click();
        Thread.sleep(1000);

//        JavascriptExecutor bjs = (JavascriptExecutor) driver;
        bjs.executeScript("window.scrollBy(0,150)", "");
        Thread.sleep(2000);

        actions.moveToElement(aSelectLekhokPageObject.book1).perform();
        Thread.sleep(2000);
        aSelectLekhokPageObject.book1AddToCurtButton.click();
        Thread.sleep(2000);
        actions.moveToElement(aSelectLekhokPageObject.book3).perform();
        Thread.sleep(2000);
        aSelectLekhokPageObject.book3AddToCurtButton.click();
        Thread.sleep(2000);

        aSelectLekhokPageObject.cartIcon.click();
        Thread.sleep(2000);

        bjs.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(2000);

        aSelectLekhokPageObject.gotoShippingPage.click();
        Thread.sleep(2000);

        aSelectLekhokPageObject.enterPhoneNo.sendKeys("01671592197");
        Thread.sleep(2000);

        aSelectLekhokPageObject.alternativePhoneNo.sendKeys("01841592197");
        Thread.sleep(2000);

//        Select drpCountry = new Select(aSelectLekhokPageObject.drpCountry);
//        drpCountry.selectByVisibleText("বাংলাদেশ");
//        drpCountry.selectByIndex(0);
//
//        Thread.sleep(2000);

        Select city = new Select(aSelectLekhokPageObject.city);
       // city.selectByVisibleText("খুলনা");
        city.selectByIndex(4);
        Thread.sleep(2000);

        aSelectLekhokPageObject.address.sendKeys("Khilgaon, Dhaka");
        Thread.sleep(2000);

        bjs.executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(2000);

        aSelectLekhokPageObject.radioButton.click();
        Thread.sleep(2000);

    }

    @AfterTest
    public static void AfterTesting() {
        // logout complete kora rakbo
    }


}
