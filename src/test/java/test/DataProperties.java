package test;

import data.loadProperties1;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecurePage;

public class DataProperties  extends  BaseTest{

        String username = loadProperties1.userData.getProperty("username")  ;
        String password = loadProperties1.userData.getProperty("password")  ;

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
    @Test
    public  void test2() {


    }

}
