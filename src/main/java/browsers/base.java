package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {
    public static WebDriver driver = null;

    @BeforeTest
    public void setup() throws IOException {

        Properties p = new Properties();


        FileInputStream fi = new FileInputStream("C:\\Users\\Alder Amu\\IdeaProjects\\facebook\\src\\main\\java\\browsers\\global.properties");
        p.load(fi);

        if(p.getProperty("browser").contains("firefox")) {
            driver = new FirefoxDriver();

        }else if(p.getProperty("browser").contains("chrome")) {
            System.setProperty("webdriver.chrome.driver", "value");
            driver = new ChromeDriver();

        }else {
            driver = new InternetExplorerDriver();
        }
        driver.get(p.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

}
