import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import testBase.Browsers;

public class RegisterAccountPageSteps {

    RegisterAccountPage registerAccountPage = new RegisterAccountPage();

   WebDriver driver;
   public void RegisterAccountPage(){
       driver = Browsers.getDriver();
   }
    private String useremail;


    @Given("I am an unregistered user on the OpenCart website")
    public void iFillInThe(String username) {
      registerAccountPage.enteruserName(username);



       // registrationAccountPageObjects.clickOnRegistrationButton();
     // registerAccountPageObjects.enterUserEmail(useremail);
        // driver new ChromeDriver();
 // driver.get(registerAccountPageObjects.url);



    }
}

