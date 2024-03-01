
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.RegisterAccountPageObject;

import java.io.IOException;

import static testBase.Browsers.driver;

public class LandingPageStepdefs {


    LandingPageObjects landingPageObjects = new LandingPageObjects();
    // RegisterAccountPageObject registerAccountPageObject = new RegisterAccountPageObject();

    public LandingPageStepdefs() throws IOException {
    }


    @Given("I navigate to {string}")
    public void iNavigateTo(String url) {


    }

    @When("I enter user name {string}")
    public void iEnterUserName(String username) {
        driver.manage().window().maximize();
    }




    //public void iNavigateToSauceDemoWebpage() {

    @Given("iNavigateToSauceDemoWebpageTo")
    @Given("I navigate to DemoOpenCart webpage")
    public void iNavigateToSauceDemoWebpage() {
    }
}

@And("I enter the {string}")
public <RegisterAccountPage> void iEnterThe(String password,  RegisterAccountPage registerAccountPage) {

    }

public void main() {
}

@And("I fill user {string}")
public void iFillUser(String arg0) {
}




