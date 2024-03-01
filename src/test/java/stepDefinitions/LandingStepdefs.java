package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LandingStepdefs {

    WebDriver driver;
    @Given("I navigate to {string}")
    public void iNavigateTo(String url) {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @When("I enter user name {string}")
    public void iEnterUserName(String username) {
        driver.manage().window().maximize();
    }

    @And("I fill user {string}")
    public void iFillUser(String arg0) {
    }
}
