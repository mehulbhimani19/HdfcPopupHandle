package Software;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mehul on 30/11/2016.
 */
public class DriverManager
{
    protected static WebDriver driver;

    public DriverManager ()
    {
        PageFactory.initElements(driver, this);

    }
@BeforeMethod
    public void openBrowser(){

        driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.hdfcbank.com/");

    }
    @AfterMethod

    public void closeBrowser ()
    {
//        driver.quit();
    }
}
