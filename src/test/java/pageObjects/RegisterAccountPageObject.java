package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testBase.Browsers;

public class RegisterAccountPageObject {
    public WebDriver driver1;

    public RegisterAccountPageObject() {
        this.driver1 = Browsers.getDriver();

        By userEmailField = By.cssSelector("#input-email");

        String useremail = "useremail";
       // public void enterUserEmail(String useremail) {
            driver1.findElement(userEmailField).sendKeys(useremail);
        }
    }

