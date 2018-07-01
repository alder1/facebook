package testcases;

import browsers.base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest1 extends base {


   // private WebDriver driver;

    @Test
    public void LoginTest() throws InterruptedException {
        LoginPage lp= new LoginPage(driver);
        lp.dologin("alder1.amu@gmail.com","angel2010");
        Thread.sleep(2000);
        lp.loginBtn();
        Assert.assertTrue(lp.AssertLogin());



//        HomePage hp= new HomePage(driver);
//        hp.clickActivePayments();

        driver.close();
    }
}
