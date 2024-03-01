import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import testBase.Browsers;

import java.io.IOException;

public class LandingPageObjects {

 public WebDriver driver1;

 public LandingPageObjects() throws IOException {
  this.driver1 = Browsers.getDriver();
 }

// private By.swagLabLogo = By.ByCssSelector("#root > div > div.login_logo");
 private By myAccountDropDown = By.id("input-username");

 public void checkAccountDropDown(){

  driver1.findElement(myAccountDropDown).click();


  }

 // public void selectRegisterDropDown(){

     }
  //   driver1.findElement(By.cssSelector("input-username"));

//}
