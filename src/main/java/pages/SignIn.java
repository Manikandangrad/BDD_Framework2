package pages;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
    public WebDriver driver;
    @FindBy(name = "logid")
    public WebElement Username;

    @FindBy(name = "pswd")
    public WebElement Password;

    @FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td/table[2]/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/table/tbody/tr[6]/td[2]/input")
    public WebElement Login;

    @FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/font/b")
    public WebElement ErrorMessage;

//    Constructor
    public SignIn(WebDriver wdriver)
    {
        driver = wdriver;
        PageFactory.initElements(driver,this);
    }
    public void User_name(String username)
    {
        Username.sendKeys(username);
    }

    public void Pass_word(String password)
    {
        Password.sendKeys(password);
    }

    public void Log_in()
    {
        Login.click();
    }

    public boolean Error_Message()
    {
        return ErrorMessage.isDisplayed();
    }
}
