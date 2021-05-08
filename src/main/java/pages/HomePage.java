package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 WebDriver driver ;

 public   HomePage (WebDriver testDriver  ){

         this.driver= testDriver ;
       PageFactory.initElements(driver, this);
 }


           @FindBy(linkText = "Form Authentication")
           WebElement loginlink ;


        public  LoginPage clickFormAuthentication  () {
       //  WebElement  login = driver.findElement(By.xpath("//a[normalize-space()='Form Authentication']"))   ;
            loginlink.click();
         return  new LoginPage(driver)   ;
        }


}
