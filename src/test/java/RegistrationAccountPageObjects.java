import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testBase.Browsers;

public class RegistrationAccountPageObjects {


    public WebDriver driver1;


    public RegistrationAccountPageObjects() {
        this.driver1 = Browsers.getDriver();
    }

    private By accountButton = By.cssSelector("");
    //  driver.findElement(By.ByCssSelector(""));

//private WebElement registerButton = driver1.findElement(By.CssSelector(""));

    public WebElement registrationFirstName = driver1.findElement(By.cssSelector(""));


    public void clickOnRegisterButton() {
        driver1.findElement(accountButton).click();

        public void clickOnRegisterButton() {
            registerButton.click();
        }
    }
}
//    public WebElement registrationLastName = driver1.findElement(By.cssSelector(""));
//
//public WebElement registrationContactUs = driver1.findElement(By.cssSelector(""));
//
//public WebElement registrationEmail = driver1.findElement(By.cssSelector(""));
//
//public WebElement registrationPassWord = driver1.findElement(By.cssSelector(""));
//
//public WebElement registrationCheckBox = driver1.findElement(By.cssSelector(""));
//
//public WebElement registrationContinueButton = driver1.findElement(By.cssSelector(""));


