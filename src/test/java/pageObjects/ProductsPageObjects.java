package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.Browsers;

import java.io.IOException;

public class ProductsPageObjects {
    public WebDriver driver;

    public ProductsPageObjects() throws IOException {
        try {
            this.driver = Browsers.getDriver();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PageFactory.initElements(driver,this);
    }

   @FindBy(name ="#add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement blackTShirt;
 //  private By tShirt = By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt");
    public void selectTShirt(){
        blackTShirt.click();
    }


        public void selectTShirt(By tShirt){
       driver.findElement(tShirt).click();
    }
}
