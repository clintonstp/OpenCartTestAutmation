import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class RegistrationAccountPageSteps {

    RegistrationAccountPageObjects registrationAccountPageObjects = new RegistrationAccountPageObjects();

   WebDriver driver;


    @Given("I am an unregistered user on the OpenCart website")
    public void iFillInThe(String useremail) {
        registrationAccountPageObjects.clickOnRegistrationButton();
     // registerAccountPageObjects.enterUserEmail(useremail);
        // driver new ChromeDriver();
 // driver.get(registerAccountPageObjects.url);







    }




    registrationAccountPageObjects.registrationFirstName.sendkeys("Clinton");
}

