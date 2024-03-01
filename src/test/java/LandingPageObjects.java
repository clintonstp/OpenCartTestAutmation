import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import testBase.Browsers;

public class LandingPageObjects {

 public WebDriver driver1;

 public LandingPageObjects(){
  this.driver1 = Browsers.getDriver();
 }
 private By myAccountDropDown = By.id("input-username");

 public void checkAccountDropDown(){

  driver1.findElement(myAccountDropDown).click();

 // public void selectRegisterDropDown(){

     }
  //   driver1.findElement(By.cssSelector("input-username"));
 }
//}
