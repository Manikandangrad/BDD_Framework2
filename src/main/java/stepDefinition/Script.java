package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Home;
import pages.SignIn;

public class Script {
    WebDriver driver;
    Home home;
    SignIn signIn;

    @Given("User launches the application")
    public void user_launches_the_application() {
        // Write code here that turns the phrase above into concrete actions
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://books.rediff.com/");
        driver.manage().window().maximize();
        home = new Home(driver);
        signIn= new SignIn(driver);
    }
    @Then("User clicks on SignIn")
    public void user_clicks_on_sign_in() {
        // Write code here that turns the phrase above into concrete actions
        home.Sign_In();
    }
    @Then("User enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
         signIn.User_name(username);
         signIn.Pass_word(password);
    }
    @Then("User clicks on Login")
    public void user_clicks_on_login() {
        // Write code here that turns the phrase above into concrete actions
       signIn.Log_in();
    }
    @Then("Username displays in the Homepage")
    public void username_displays_in_the_homepage() {
        // Write code here that turns the phrase above into concrete actions
       home.nameDisplay();
    }
    @Then("Error message is displayed")
    public void error_message_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        signIn.Error_Message();
        Assert.assertTrue("Error Message not appeared", signIn.Error_Message());
    }
    @Then("Close the Application")
    public void close_the_application() {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }

}
