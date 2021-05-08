package steps;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SecurePage;
import sun.security.util.PendingException;


 public  class LoginSteps {

    public HomePage homePage;
    public LoginPage login;
    protected SecurePage secure;

    @Given("^the user in the home page$")
    public void the_user_in_the_home_page() throws Throwable {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @When("^I click on authentication form$")
    public void i_click_on_authentication_form() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login = homePage.clickFormAuthentication();
    }
    @When("^I entered \"([^\"]*)\" , \"([^\"]*)\"$")
    public void i_entered(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.setdatawithcsv(username,password);
    }

    @Then("^The secure page displayed successfully$")
    public void the_secure_page_displayed_successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        secure = login.clicklogin();
        secure.securecheck();
    }

}


