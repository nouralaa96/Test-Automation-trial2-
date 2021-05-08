package test;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;

public class BaseTest extends AbstractTestNGCucumberTests {
     protected WebDriver driver ;
     protected   HomePage homePage ;
     protected LoginPage  login ;
     @BeforeClass
     public void setup () {
          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver() ;
     }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

  /*  @AfterClass
    public void tearDown(){
        driver.quit();
    }  */

}
