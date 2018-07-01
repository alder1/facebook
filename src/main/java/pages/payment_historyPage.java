package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Name;

public class payment_historyPage {
    WebDriver driver;

    public payment_historyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "html/body/form/div[3]/div/div[1]/aside/div/div[6]/div/div[1]/a")
    private WebElement TransactionHistory;

    @FindBy(xpath = "html/body/form/div[3]/div/div[1]/aside/div/div[6]/div/div[2]/ul/li[1]/a/span[1]")
    private WebElement PaymentHistory;

    @FindBy(id = "_ctl0_selChoosePupil")
    private WebElement Name;

    @FindBy(id = "_ctl0_selChooseService")
    private WebElement PaymentItem;

    @FindBy(id = "_ctl0_txtChooseStartDate")
    private WebElement StartDate;

    @FindBy(id = "_ctl0_txtChooseEndDate")
    private WebElement EndDate;

    @FindBy(id = "_ctl0_cmdSearch")
    private WebElement Search;

    @FindBy(xpath = "html/body/form/div[2]/div/div[2]/div/div[1]/p")
    private WebElement ConfirmWhatToSearch;

    public void Payments(String start, String end) throws InterruptedException {
        TransactionHistory.click();
        PaymentHistory.click();
        Thread.sleep(2000);

        PaymentItem.click();
        EndDate.sendKeys();
        Search.click();
    }

    public boolean AssertAll() {
        return ConfirmWhatToSearch.isDisplayed();

    }

}




