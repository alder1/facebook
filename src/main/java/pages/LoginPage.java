package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // @FindBy(xpath = "html/body/div[2]/header/div[1]/div/div/button")
    // private WebElement cookie;

    @FindBy(xpath = "html/body/header/div/div/div[3]/div/div[2]/a")
    private WebElement LoginButton;

    @FindBy(id = "email")
    private WebElement EmailOrUsername;

    @FindBy(id = "password")
    private WebElement Password;

    @FindBy(xpath = "html/body/div[2]/div/div/div/section/div[3]/div[1]/div/div/form/fieldset/div[2]/button")
    private WebElement Login2;

    @FindBy(xpath = "html/body/form/div[2]/div[2]/div/div/div[2]/p/span[1]")
    private WebElement ConfirmLogin;

    public void dologin(String myemail, String myPassword) throws InterruptedException {
        //cookie.click();
        Thread.sleep(2000);
        LoginButton.click();
        Thread.sleep(2000);
        EmailOrUsername.sendKeys(myemail);
        Password.sendKeys(myPassword);
        //Login.click();
    }

    public void loginBtn() {
        Login2.click();
    }

    public boolean AssertLogin(){
        return ConfirmLogin.isDisplayed();

    }
}