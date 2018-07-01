package testcases;

import browsers.base;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.create_mealPage;

public class create_mealTest extends base {

    @Test
    public void buyMeal() throws InterruptedException {
        LoginPage lp= new LoginPage(driver);
        lp.dologin("alder1.amu@gmail.com","angel2010");
        Thread.sleep(2000);
        lp.loginBtn();

        create_mealPage cam = new create_mealPage(driver);
        cam.basket("2.50");

    }
}
