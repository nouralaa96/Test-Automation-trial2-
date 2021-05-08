package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.HomePage;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase2 {
           public  String BaseURL ="https://the-internet.herokuapp.com/" ;
       protected   ThreadLocal <RemoteWebDriver>  driver = null ;    // for selenium Grid

    @BeforeClass
    @Parameters(value= {"browser"})
    public  void setup( @Optional("chrome") String browser ) throws MalformedURLException {

        driver = new ThreadLocal<>();
        DesiredCapabilities caps = new DesiredCapabilities();
       //caps.setBrowserName("chrome");
       //  caps.setPlatform(Platform.WINDOWS);
        caps.setCapability("browserName", browser);

            // Selenium Grid Local
        driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),caps));
               getDriver().navigate().to(BaseURL);


    }
    public WebDriver getDriver()
    {
        return driver.get();
    }

  /*  @AfterClass
    public void stopDriver()
    {
        getDriver().quit();
        driver.remove();
    }*/
}
