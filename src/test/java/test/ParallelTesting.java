package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecurePage;

public class ParallelTesting extends TestBase2{


   @Test
    public void   test1() {

       getDriver().findElement(By.linkText("Form Authentication")).click();

       getDriver().findElement(By.id("username")).sendKeys("tomsmith");

       getDriver().findElement(By.id("password")) .sendKeys("SuperSecretPassword!");

   }
}
