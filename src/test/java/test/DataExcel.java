package test;

import data.ExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecurePage;

import java.io.IOException;

public class DataExcel  extends  BaseTest{
     LoginPage login ;
     SecurePage secure ;


    @DataProvider(name="Excel_data")
   public Object [] [] loginData() throws IOException {
         ExcelReader ex = new ExcelReader() ;
         return  ex.getExcelData() ;
  }
 @Test(dataProvider ="Excel_data")
  public  void login( String username2 , String password2 ) {
     login = homePage.clickFormAuthentication();
      login.setUsername(username2);
      login.setPassword(password2);
     //login.setdatawithcsv(username, password);
     secure = login.clicklogin();
     secure.securecheck();

  }

}
