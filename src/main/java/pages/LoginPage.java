package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver ;

    public LoginPage(WebDriver homepagedriver) {
        this.driver = homepagedriver;
        PageFactory.initElements(driver ,this) ;
    }
    @FindBy(id="username")
    WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(className="radius")
    WebElement loginbutton;

    public void setUsername(String usernametext){
        username.sendKeys(usernametext);
    }
    public void setPassword(String passwordtext){
        password.sendKeys(passwordtext);
    }
    public SecurePage clicklogin(){
        loginbutton.click();
      return  new SecurePage(driver) ;
    }

    public void setdatawithcsv(String username1, String password1) {
        username.sendKeys(username1);
        password.sendKeys(password1);

    }
}