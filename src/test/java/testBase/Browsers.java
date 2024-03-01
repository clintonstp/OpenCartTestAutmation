package testBase;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

    private static EdgeDriver driver = new EdgeDriver();

    public static WebDriver getDriver() {

     String browser = "chrome";

     switch (browser) {
         case "chrome":
             driver = new ChromeDriver();
             break;
         case "ff":
             driver = new FirefoxDriver();
             break;
         case "edge":
             driver = new EdgeDriver();
             break;
         default:
             driver = new ChromeDriver();

             driver.get(url);
             driver.manage().window().maximize();
             return driver;

        @AfterClass
         public void closeBrowser() {driver.quit();}
// beforeclass, beforefeature,beforescenario, before step
     }
 }
}