package testcases;

import browsers.base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.logOut_page;

import java.io.File;
import java.io.IOException;

public class logOut_Test extends base {

    @Test
    public void logOut_Test() throws InterruptedException, IOException {
        LoginPage lp= new LoginPage(driver);
        lp.dologin("alder1.amu@gmail.com","angel2010");
        Thread.sleep(2000);
        lp.loginBtn();
        logOut_page lop = new logOut_page(driver);
        lop.Logout();
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFileToDirectory(srcFile, new File("src\\main\\java\\snapshots\\logoutPic.png"));
    }

}
