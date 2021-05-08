package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecurePage;

public class TestLogin extends BaseTest {


    LoginPage loginPage ;
    SecurePage securePage ;
      @Test
     public void test_login  () {
          loginPage =  homePage.clickFormAuthentication() ;
          loginPage.setUsername("tomsmith");
          loginPage.setPassword("SuperSecretPassword!");
          securePage=  loginPage.clicklogin();
          securePage.securecheck();
      }


}
