package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
    WebDriver driver;
        //    Find the Element
        @FindBy(linkText = "Sign In")
        public WebElement signIn;


        @FindBy(id = "username")
        public WebElement UsernameShown;

        //    Constructor
    public Home(WebDriver wdriver) {
            driver = wdriver;
            PageFactory.initElements(driver,this);
        }

//    Doing Actions
        public void Sign_In()
        {
            signIn.click();
        }
        public boolean nameDisplay()
        {
            return UsernameShown.isDisplayed();
        }

    }


