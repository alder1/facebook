package testcases;

import browsers.base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.create_mealPage;
import pages.payment_historyPage;

public class payment_historyTest extends base {

    @Test
    public void transaction() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        lp.dologin("alder1.amu@gmail.com", "angel2010");
        Thread.sleep(2000);
        lp.loginBtn();


        payment_historyPage ph = new payment_historyPage(driver);
        ph.Payments("28/05/2018", "04/06/2108");
        Assert.assertTrue(ph.AssertAll());
    }

    }
