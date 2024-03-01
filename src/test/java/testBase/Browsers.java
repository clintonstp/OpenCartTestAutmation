package testBase;

import io.cucumber.java.Before;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import java.io.*;
import java.time.Duration;
import java.util.Properties;

import static java.lang.System.getProperties;

public class Browsers {

    public static WebDriver driver;

   // static String url = "https://www.saucedemo.com/";
    static Properties prop;

    @BeforeClass
    public static WebDriver getDriver() throws IOException {
        File srcProp = new File( getProperties("user.dir") +"\\Resources\\Profiles\\Dev\\devconfig.properties");
        // Create FileInputStream object
        FileInputStream fisProp = new FileInputStream(srcProp);

        // Create Properties class object to read properties file
        prop = new Properties();

        // load file so we can iuse into our script
        prop.load(fisProp);

        switch ("chrome") {
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

             driver.get(driver.getCurrentUrl());
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // all the elements on the landing page
             driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); // page load for the landing page
             return driver;

      //  @AfterClass
        // public void closeBrowser() {driver.quit();}
// beforeclass, beforefeature,beforescenario, before step
            // Explicit wait is for particular element
     }
        return null;
    }

    private static File getProperties(String s) {
        return null;
    }
}
