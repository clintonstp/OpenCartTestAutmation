package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testBase.Browsers;

import java.io.IOException;

import static testBase.Browsers.getDriver;

public class LandingPageObjects {

    public WebDriver driver1;

    public LandingPageObjects() throws IOException {
        this.driver1 = getDriver();
    }

    private By myAccountDropDown = By.id("Id attribute is not available for this element");

    public void checkAccountDropDwon(){
        driver1.findElement(myAccountDropDown).click();
    }
}
