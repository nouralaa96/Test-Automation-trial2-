package pages;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static org.testng.Assert.*;

public class SecurePage {
    WebDriver driver ;
     public SecurePage (WebDriver logindriver ) {
         this.driver= logindriver ;
         PageFactory.initElements(driver ,this) ;
     }

      @FindBy(xpath = "//h2[normalize-space()='Secure Area']")
      WebElement secure  ;

     public void  securecheck () {
         Assert.assertEquals( secure.getText() , "Secure Area" ,"failed");
     }

}
