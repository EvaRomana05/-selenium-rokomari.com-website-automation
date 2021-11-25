package TestCases;

import BasicPackage.DriverSetUp;
import PageObject.SignUpUsingGooglePageObject;
import io.github.cdimascio.dotenv.Dotenv;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignUpUsingGoogle_TestCase_01 extends DriverSetUp {

    public static String baseUrl = "https://www.rokomari.com/book";


    public static void signUp() throws InterruptedException {

        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        Dotenv dotenv = Dotenv.load();

        SignUpUsingGooglePageObject aSignUpUsingGooglePageObject = new SignUpUsingGooglePageObject(driver);
        Thread.sleep(2000);

        aSignUpUsingGooglePageObject.signInButton.click();
        Thread.sleep(2000);

        aSignUpUsingGooglePageObject.googleButton.click();
        Thread.sleep(2000);

        aSignUpUsingGooglePageObject.email.sendKeys(dotenv.get("EMAIL_ADDRESS"));
        Thread.sleep(2000);

        aSignUpUsingGooglePageObject.nextButton.click();
        Thread.sleep(2000);

        aSignUpUsingGooglePageObject.password.sendKeys(dotenv.get("EMAIL_PASSWORD"));
        Thread.sleep(2000);

        aSignUpUsingGooglePageObject.nextButton2.click();
        Thread.sleep(5000);

    }
}