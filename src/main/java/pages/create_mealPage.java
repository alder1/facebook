package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class create_mealPage {
    WebDriver driver;
    public create_mealPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "body_body_lvConsumerAreas_btnPayForMeals_0")
    private WebElement payForMeal;

    //
    @FindBy(id = "edit-amount")
    private WebElement amount;

    @FindBy(id = "basket-add")
    private WebElement addToBasket;

    @FindBy(xpath = "html/body/form/div[3]/div/div[2]/div[6]/div/div/div/div[2]/p[2]/a" )
    private WebElement viewBasket;

    @FindBy(id = "body_body_PayNow")
    private WebElement payNow;

    @FindBy(xpath = "html/body/div[1]/div/h1")
    private WebElement secureCheckout;

    @FindBy(id = "c_btnCancel")
    private WebElement cancel;

    @FindBy(xpath = "html/body/form/div[3]/div/div[2]/div[6]/div[1]/div/div/h1")
    private WebElement basket;

    @FindBy(id = "cmdLogout")
    private WebElement logOut;

    public void basket(String myAmount){
        payForMeal.click();
        amount.sendKeys(myAmount);
        addToBasket.click();
        viewBasket.click();
        payNow.click();
        secureCheckout.isDisplayed();
        cancel.click();
        basket.isDisplayed();
        logOut.click();
    }
    public void pTest() {
        System.out.println("test, test");

    }


}
