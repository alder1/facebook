package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logOut_page {
    WebDriver driver;
    public logOut_page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "cmdLogout")
    private WebElement LogOut;

    @FindBy(id = "main-login-button")
    private WebElement LoginButton;

    public void Logout(){
        LogOut.click();
        LoginButton.isDisplayed();

    }
    }
