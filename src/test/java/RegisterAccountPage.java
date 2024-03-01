import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import testBase.Browsers;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static testBase.Browsers.driver;

public class RegisterAccountPage {
    public WebDriver driver1;
    public RegisterAccountPage() throws IOException {this.driver1 = Browsers.getDriver(); }

//private By userNameField = By.cssSelector("#user-name");

  //  private By userNameField = By.xpath("//*[@id=\"user-name\"]");
    private By userNameField = By.xpath("//*[@id=\"user-name\"]");
    private By loginlogo = By.cssSelector("logoin_logo");
    private By passWordField = By.cssSelector("#password");
    private By loginButton = By.cssSelector("#login_button");
    private By productPage = By.cssSelector("#header_container > div.header_secondary_container >span");
public void enteruserName(String username){
    Wait wait = new WebDriverWait(driver1, Duration.ofSeconds(10)); // Declared  Wait class and initialise with WebDriver Wait
    wait.until(d ->driver1.findElement(userNameField).isDisplayed()); // condition instead wait.until(d ->driver1.findElement(userNameField).sendKeys(username));
    driver1.findElement(userNameField).sendKeys(username);

  //  driver1.findElement(userNameField).sendkeys(username);
    }

    public void enterPassWord(String password){

    driver1.findElement(passWordField).sendKeys(password);
    }
    public void checkLandingPage(){
    driver1.findElement(loginlogo).isDisplayed();
     driver1.findElement(loginButton).click();
}

public void bags(){
    List<WebElement> redbags =driver.findElements(By.className("#inventory_item_img"));

    //for (String i : cars) {

}
public boolean isProductPageDisplayed(String productPageIsNotDisplay){
    return driver1.findElement(productPage).isDisplayed();
}
// CLICK, CLEAR,SUMIT, SENDKEYS
// ISENABLE, ISDISPLAYED

public void assertProductPageDisplayed(){
    Assert.assertTrue( isProductPageDisplayed("product page is not display"));
}
  //  private By accountButton = By.cssSelector("");
    //  driver.findElement(By.ByCssSelector(""));

//private WebElement registerButton = driver1.findElement(By.CssSelector(""));

    //public WebElement registrationFirstName = driver1.findElement(By.cssSelector(""));


   //public void clickOnRegisterButton() {
      //  driver1.findElement(accountButton).click();

       // public void clickOnRegisterButton() {
         //   registerButton.click();
        }
   // }

//    public WebElement registrationLastName = driver1.findElement(By.cssSelector(""));

//public         WebElement registrationContactUs = driver1.findElement(By.cssSelector(""));

//public WebElement registrationEmail = driver1.findElement(By.cssSelector(""));

//public WebElement registrationPassWord = driver1.findElement(By.cssSelector(""));

//public WebElement registrationCheckBox = driver1.findElement(By.cssSelector(""));

//public WebElement registrationContinueButton = driver1.findElement(By.cssSelector(""));


